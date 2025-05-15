package com.example.monitoringSystem.controllers;


import com.example.monitoringSystem.lab2Patterns.bridge.BridgePatternCommunication.*;
import com.example.monitoringSystem.lab2Patterns.bridge.BridgePatternMessure.*;
import com.example.monitoringSystem.lab2Patterns.bridge.BridgePatternMessure.TemperatureSensorBridge;

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

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Controller
public class Lab2Controller {

    @GetMapping("/lab2")
    public String showLab2Page(Model model) {

        // === Adapter Pattern ===

        // Adapter - konwersja temperatury
        TemperatureSensor celsiusSensor = new CelsiusSensor();
        TemperatureUnitAdapter tempAdapter = new TemperatureUnitAdapter(celsiusSensor.getTemperature());
        double fahrenheitTemp = tempAdapter.toFahrenheit();
        double kelvinTemp = tempAdapter.toKelvin();

        // Adapter - konwersja prędkości wiatru
        KmphWindSensor windSensor = new KmphWindSensor();
        MphWindAdapter windAdapter = new MphWindAdapter(windSensor.getspeed());
        double mphWindSpeed = windAdapter.toMph();

        // Adapter - konwersja ciśnienia
        HpaPressureSensor pressureSensor = new HpaPressureSensor();
        MmHgPressureAdapter pressureAdapter = new MmHgPressureAdapter(pressureSensor.getPressure());
        double mmHgPressure = pressureAdapter.toMmHg();

        // Przekazanie danych do widoku
        model.addAttribute("fahrenheitTemp", fahrenheitTemp);
        model.addAttribute("kelvinTemp", kelvinTemp);
        model.addAttribute("mphWindSpeed", mphWindSpeed);
        model.addAttribute("mmHgPressure", mmHgPressure);


        // === Bridge Pattern: Sensor Stations ===
        MeasurementStationBridge weatherStation = new WeatherStationBridge(new TemperatureSensorBridge());
        MeasurementStationBridge industrialStation = new IndustrialStationBridge(new HumiditySensorBridge());
        MeasurementStationBridge multiSensorStation = new MultiSensorStationBridge(new TemperatureSensorBridge(), new HumiditySensorBridge());

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
        MeasurementStation station = new BasicMeasurementStation();
        MeasurementStation fullFeatureStation = new LoggingDecorator(new AlertDecorator(station));

        String measurementResults = fullFeatureStation.measure();
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

        TemperatureSensorComposite tempSensorC = new TemperatureSensorComposite("S001",21.9);
        PressureSensorComposite pressureSensorComposite = new PressureSensorComposite("S002", 1013.25);
        HumiditySensorComposite humiditySensorComposite = new HumiditySensorComposite("S003", 65.0);

        tempSensorC.getTemperature();
        pressureSensorComposite.getPressure();
        humiditySensorComposite.getHumidity();

        tempSensorC.showMeasurement();
        tempSensorC.reset();

        List<SensorComposite> sensors = List.of(tempSensorC, pressureSensorComposite, humiditySensorComposite);

        MonitoringStationComposite stationC = new MonitoringStationComposite("Station A", sensors);
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

        List<CityComposite> lub = List.of(cityStation, cityStation2, cityStation3);

        MeasurementStationRegion regionStation = new MeasurementStationRegion(lub, "Lubelskie");
        regionStation.showPollutions();

        System.out.println("--- Kompozyt 3 ---");
        Measurement measurement1 = new Measurement(LocalDate.now(), "high", 20, 60, 1013);
        Measurement measurement2 = new Measurement(LocalDate.now().minusDays(1), "low", 25, 70, 1015);
        Measurement measurement3 = new Measurement(LocalDate.now().minusDays(2), "medium", 22, 65, 1010);

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
