package com.example.monitoringSystem.controllers;


import com.example.monitoringSystem.lab2Patterns.bridge.BridgePatternCommunication.*;
import com.example.monitoringSystem.lab2Patterns.bridge.BridgePatternMessure.*;
import com.example.monitoringSystem.lab2Patterns.bridge.BridgePatternMessure.TemperatureSensorB;

import com.example.monitoringSystem.lab2Patterns.bridge.BridgePatternReport.*;

import com.example.monitoringSystem.lab2Patterns.composite.*;
import com.example.monitoringSystem.lab2Patterns.decorator.Alart.AlertDecorator;
import com.example.monitoringSystem.lab2Patterns.decorator.Alart.BasicMeasurementStation;
import com.example.monitoringSystem.lab2Patterns.decorator.Alart.LoggingDecorator;

import com.example.monitoringSystem.lab2Patterns.decorator.Alart.MeasurementStation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.monitoringSystem.lab2Patterns.adapter.*;

import java.util.List;

@Controller
public class Lab2Controller {

    @GetMapping("/lab2")
    public String showLab2Page(Model model) {
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

        //Dcorator Logging and Alerts
        // Base measurement station
        MeasurementStation station = new BasicMeasurementStation();
        // Alert
        MeasurementStation fullFeatureStation = new LoggingDecorator(new AlertDecorator(station));
        // Perform measurement and capture results
        String measurementResults = fullFeatureStation.measure();
        // Pass results to the HTML template
        model.addAttribute("measurementResults", measurementResults);

        //Composite pattern
        System.out.println("--- Kompozyt ---");
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

        return "lab2";
    }
}
