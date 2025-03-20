package com.example.monitoringSystem.lab2Patterns.bridge.BridgePatternMessure;

// Test the implementation
public class BridgePatternMessure {
    public static void main(String[] args) {

        MeasurementStationB weatherStation = new WeatherStationB(new TemperatureSensor());
        weatherStation.measure();

        MeasurementStationB industrialStation = new IndustrialStationB(new HumiditySensor());
        industrialStation.measure();

        MeasurementStationB multiSensorStation = new MultiSensorStationB(new TemperatureSensor(), new HumiditySensor());
        multiSensorStation.measure();
    }
}
