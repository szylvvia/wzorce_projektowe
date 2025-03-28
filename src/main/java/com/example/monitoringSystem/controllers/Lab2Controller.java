package com.example.monitoringSystem.controllers;


import com.example.monitoringSystem.lab1Patterns.factory.SensorF;
import com.example.monitoringSystem.lab2Patterns.bridge.BridgePatternCommunication.*;
import com.example.monitoringSystem.lab2Patterns.bridge.BridgePatternMessure.*;
import com.example.monitoringSystem.lab2Patterns.bridge.BridgePatternMessure.TemperatureSensorB;

import com.example.monitoringSystem.lab2Patterns.bridge.BridgePatternReport.*;

import com.example.monitoringSystem.lab2Patterns.composite.*;
import com.example.monitoringSystem.lab2Patterns.decorator.Alart.AlertDecorator;
import com.example.monitoringSystem.lab2Patterns.decorator.Alart.BasicMeasurementStation;
import com.example.monitoringSystem.lab2Patterns.decorator.Alart.LoggingDecorator;

import com.example.monitoringSystem.lab2Patterns.decorator.Alart.MeasurementStation;
import com.example.monitoringSystem.lab2Patterns.decorator.Sensor.AllPurposeSensor;
import com.example.monitoringSystem.lab2Patterns.decorator.Sensor.AnalogSensor;
import com.example.monitoringSystem.lab2Patterns.decorator.Sensor.DigitalSensor;
import com.example.monitoringSystem.lab2Patterns.decorator.Sensor.SensorD;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.monitoringSystem.lab2Patterns.adapter.*;
import com.example.monitoringSystem.lab2Patterns.decorator.Authorization.*;

import java.sql.Time;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Controller
public class Lab2Controller {

    @GetMapping("/lab2")
    public String showLab2Page(Model model) {

        // === Adapter Pattern ===

        // Adapter - konwersja temperatury
        com.example.monitoringSystem.lab2Patterns.adapter.TemperatureSensor celsiusSensor = new CelsiusSensor();
        TemperatureUnitAdapter tempAdapter = new TemperatureUnitAdapter(celsiusSensor);
        double fahrenheitTemp = tempAdapter.getTemperatureInFahrenheit();
        double kelvinTemp = tempAdapter.getTemperatureInKelvin();

        // Adapter - konwersja prędkości wiatru
        WindSpeedSensor windSensor = new KmphWindSensor();
        WindSpeedAdapter windAdapter = new MphWindAdapter(windSensor);
        double mphWindSpeed = windAdapter.getSpeed();

        // Adapter - konwersja ciśnienia
        PressureSensor pressureSensor = new HpaPressureSensor();
        PressureAdapter pressureAdapter = new MmHgPressureAdapter(pressureSensor);
        double mmHgPressure = pressureAdapter.getPressure();

        // Przekazanie danych do widoku
        model.addAttribute("fahrenheitTemp", fahrenheitTemp);
        model.addAttribute("kelvinTemp", kelvinTemp);
        model.addAttribute("mphWindSpeed", mphWindSpeed);
        model.addAttribute("mmHgPressure", mmHgPressure);


        // === Bridge Pattern: Sensor Stations ===
        MeasurementStationB weatherStation = new WeatherStationB(new TemperatureSensorB());
        MeasurementStationB industrialStation = new IndustrialStationB(new HumiditySensorB());
        MeasurementStationB multiSensorStation = new MultiSensorStationB(new TemperatureSensorB(), new HumiditySensorB());

        // Perform measurement and get results
        String weatherStationResults = weatherStation.measure();
        String industrialStationResults = industrialStation.measure();
        String multiSensorStationResults = multiSensorStation.measure();

        model.addAttribute("weatherStationResults", weatherStationResults);
        model.addAttribute("industrialStationResults", industrialStationResults);
        model.addAttribute("multiSensorStationResults", multiSensorStationResults);

        // === Bridge Pattern: Communication Modules ===
        CommunicatingMeasurementStation weatherCommStation = new WeatherStationWithCommunication(new HttpCommunication());
        CommunicatingMeasurementStation industrialCommStation = new IndustrialStationWithCommunication(new MqttCommunication());

        String weatherCommResults = weatherCommStation.measureAndSend();
        String industrialCommResults = industrialCommStation.measureAndSend();

        model.addAttribute("weatherCommResults", weatherCommResults);
        model.addAttribute("industrialCommResults", industrialCommResults);

        // === Bridge Pattern: Report Generation ===
        ReportableMeasurementStation weatherStationR = new WeatherStationWithReports(new PdfReportGenerator());
        ReportableMeasurementStation industrialStationR = new IndustrialStationWithReports(new CsvReportGenerator());

        // Generate reports
        String weatherReportResult = weatherStationR.measureAndReport("WeatherReport");
        String industrialReportResult = industrialStationR.measureAndReport("IndustrialReport");

        model.addAttribute("weatherReportResult", weatherReportResult);
        model.addAttribute("industrialReportResult", industrialReportResult);

        // === Decorator 1: Logging and Alerts ===
        //Decorator Logging and Alerts
        // Base measurement station
        MeasurementStation station = new BasicMeasurementStation();
        // Alert
        MeasurementStation fullFeatureStation = new LoggingDecorator(new AlertDecorator(station));
        // Perform measurement and capture results
        String measurementResults = fullFeatureStation.measure();
        // Pass results to the HTML template
        model.addAttribute("measurementResults", measurementResults);

        // === Decorator 2: Autoryzacja ===
        SensorAuth basicSensor = new BasicSensor("Temperature Sensor");
        SensorAuth authorizedSensor = new AuthorizedSensorDecorator(basicSensor, true);
        SensorAuth unauthorizedSensor = new AuthorizedSensorDecorator(basicSensor, false);

        model.addAttribute("resultAuthorized", executeMeasurement(authorizedSensor));
        model.addAttribute("resultUnauthorized", executeMeasurement(unauthorizedSensor));

        // === Decorator 3: Kalibracja sensorów ===
        System.out.println("--- Dekorator 3 ---");
        SensorD digitalSensor = new DigitalSensor(new AllPurposeSensor());
        SensorD analogSensor = new AnalogSensor(new AllPurposeSensor());
        SensorD digitalAnalogSensor =  new DigitalSensor(new AnalogSensor(new AllPurposeSensor()));

        digitalSensor.calibrateSensor();
        analogSensor.calibrateSensor();
        digitalAnalogSensor.calibrateSensor();

        //Composite pattern
        System.out.println("--- Kompozyt 1 ---");

        TemperatureSensorC tempSensorC = new TemperatureSensorC("S001",21.9);
        PressureSensorC pressureSensorC = new PressureSensorC("S002", 1013.25);
        HumiditySensorC humiditySensorC = new HumiditySensorC("S003", 65.0);

        tempSensorC.getTemperature();
        pressureSensorC.getPressure();
        humiditySensorC.getHumidity();

        tempSensorC.showMeasurement();
        tempSensorC.reset();

        List<SensorC> sensors = List.of(tempSensorC, pressureSensorC, humiditySensorC);

        MonitoringStationC stationC = new MonitoringStationC("Station A", sensors);
        stationC.showMeasurement();
        stationC.reset();

        String details = stationC.getDetails();
        model.addAttribute("composite1details", details);

        System.out.println("--- Kompozyt 2 ---");
        MeasurementStationCity cityStation = new MeasurementStationCity("Lublin", "medium");
        MeasurementStationCity cityStation2 = new MeasurementStationCity("Swidnik", "low");
        MeasurementStationCity cityStation3 = new MeasurementStationCity("Naleczow", "high");

        cityStation.showPollutions();
        cityStation.setPollutionLevel("high");

        List<CityC> lub = List.of(cityStation, cityStation2, cityStation3);

        MeasurementStationRegion regionStation = new MeasurementStationRegion(lub, "Lubelskie");
        regionStation.showPollutions();

        System.out.println("--- Kompozyt 3 ---");
        Measurement measurement1 = new Measurement(LocalDate.now(), "high", "20", "60", "1013");
        Measurement measurement2 = new Measurement(LocalDate.now().minusDays(1), "low", "25", "70", "1015");
        Measurement measurement3 = new Measurement(LocalDate.now().minusDays(2), "medium", "22", "65", "1010");

        List<TimeInterval> measurements = new ArrayList<>(List.of(measurement1, measurement2));

        CityMeasurementsGroup cityMeasurementsGroup = new CityMeasurementsGroup("Lublin", measurements);
        cityMeasurementsGroup.addMeasurement(measurement3);

        cityMeasurementsGroup.showMeasurement();

        return "lab2";
    }

    private String executeMeasurement(SensorAuth sensor) {
        try {
            sensor.measure();
            return "Measurement successful!";
        } catch (SecurityException e) {
            return "Measurement failed: " + e.getMessage();
        }
    }
}
