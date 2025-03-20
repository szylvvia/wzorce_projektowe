package com.example.monitoringSystem.lab2Patterns.bridge.BridgePatternMessure;

// Test the implementation
public class BridgePatternMessure {
    public static void main(String[] args) {

        MeasurementStationB weatherStation = new WeatherStationB(new TemperatureSensorB());
        weatherStation.measure();

        MeasurementStationB industrialStation = new IndustrialStationB(new HumiditySensorB());
        industrialStation.measure();

        MeasurementStationB multiSensorStation = new MultiSensorStationB(new TemperatureSensorB(), new HumiditySensorB());
        multiSensorStation.measure();
    }
}
