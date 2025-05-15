package com.example.monitoringSystem.controllers;


import com.example.monitoringSystem.lab2Patterns.bridge.BridgePatternCommunication.*;
import com.example.monitoringSystem.lab2Patterns.bridge.BridgePatternMessure.*;
import com.example.monitoringSystem.lab2Patterns.bridge.BridgePatternMessure.TemperatureSensorBridge;

import com.example.monitoringSystem.lab2Patterns.bridge.BridgePatternReport.*;

import com.example.monitoringSystem.lab2Patterns.composite.*;
import com.example.monitoringSystem.lab2Patterns.decorator.Alert.AlertDecorator;
import com.example.monitoringSystem.lab2Patterns.decorator.Alert.BasicMeasurementStation;
import com.example.monitoringSystem.lab2Patterns.decorator.Alert.LoggingDecorator;

import com.example.monitoringSystem.lab2Patterns.decorator.Alert.MeasurementStation;
import com.example.monitoringSystem.lab2Patterns.decorator.Sensor.AllPurposeSensorSensor;
import com.example.monitoringSystem.lab2Patterns.decorator.Sensor.AnalogSensorSensor;
import com.example.monitoringSystem.lab2Patterns.decorator.Sensor.DigitalSensorSensor;
import com.example.monitoringSystem.lab2Patterns.decorator.Sensor.SensorSensor;
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
        TemperatureUnitAdapter temperatureAdapter = new TemperatureUnitAdapter(celsiusSensor.getTemperature());
        double fahrenheitTemperature = temperatureAdapter.toFahrenheit();
        double kelvinTemperature = temperatureAdapter.toKelvin();

        // Adapter - konwersja prędkości wiatru
        KmphWindSensor windSensor = new KmphWindSensor();
        MphWindAdapter windAdapter = new MphWindAdapter(windSensor.getspeed());
        double mphWindSpeed = windAdapter.toMph();

        // Adapter - konwersja ciśnienia
        HpaPressureSensor pressureSensor = new HpaPressureSensor();
        MmHgPressureAdapter pressureAdapter = new MmHgPressureAdapter(pressureSensor.getPressure());
        double mmHgPressure = pressureAdapter.toMmHg();

        // Przekazanie danych do widoku
        model.addAttribute("fahrenheitTemp", fahrenheitTemperature);
        model.addAttribute("kelvinTemp", kelvinTemperature);
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
        SensorSensor digitalSensor = new DigitalSensorSensor(new AllPurposeSensorSensor());
        SensorSensor analogSensor = new AnalogSensorSensor(new AllPurposeSensorSensor());
        SensorSensor digitalAnalogSensor =  new DigitalSensorSensor(new AnalogSensorSensor(new AllPurposeSensorSensor()));

        digitalSensor.calibrateSensor();
        analogSensor.calibrateSensor();
        digitalAnalogSensor.calibrateSensor();

        //Composite pattern
        System.out.println("--- Kompozyt 1 ---");

        double temperatureFromSensorS001 = 21.9;
        double pressureFromSensorS002 = 1013.25;
        double humidityFromSensorS003 = 65.0;

        TemperatureSensorComposite tempSensorC = new TemperatureSensorComposite("S001", temperatureFromSensorS001);
        PressureSensorComposite pressureSensorComposite = new PressureSensorComposite("S002", pressureFromSensorS002);
        HumiditySensorComposite humiditySensorComposite = new HumiditySensorComposite("S003", humidityFromSensorS003);

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

        double temperatureValueCity = 25.0;
        double humidityValueCity = 60.0;
        double pressureValueCity = 1013.0;

        double temperatureValueVillage = 22.0;
        double humidityValueVillage = 55.0;
        double pressureValueVillage = 1010.0;
        int dayToSubtractVillage = 1;

        double temperatureValueCoastal = 20.0;
        double humidityValueCoastal = 70.0;
        double pressureValueCoastal = 1005.0;
        int dayToSubtractCoastal = 2;


        Measurement measurementFromCity = new Measurement(LocalDate.now(), "high", temperatureValueCity, humidityValueCity, pressureValueCity);
        Measurement measurementFromVillage = new Measurement(LocalDate.now().minusDays(dayToSubtractVillage), "low", temperatureValueVillage, humidityValueVillage, pressureValueVillage);
        Measurement measurementFromCoastal = new Measurement(LocalDate.now().minusDays(dayToSubtractCoastal), "medium", temperatureValueCoastal, humidityValueCoastal, pressureValueCoastal);

        List<TimeInterval> measurements = new ArrayList<>(List.of(measurementFromCity, measurementFromVillage));

        CityMeasurementsGroup cityMeasurementsGroup = new CityMeasurementsGroup("Lublin", measurements);
        cityMeasurementsGroup.addMeasurement(measurementFromCoastal);

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
