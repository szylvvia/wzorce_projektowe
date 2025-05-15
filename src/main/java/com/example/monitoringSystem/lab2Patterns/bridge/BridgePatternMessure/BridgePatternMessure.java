package com.example.monitoringSystem.lab2Patterns.bridge.BridgePatternMessure;

// Test the implementation
public class BridgePatternMessure {
    public static void main(String[] args) {

        MeasurementStationBridge weatherStation = new WeatherStationBridge(new TemperatureSensorBridge());
        weatherStation.measure();

        MeasurementStationBridge industrialStation = new IndustrialStationBridge(new HumiditySensorBridge());
        industrialStation.measure();

        MeasurementStationBridge multiSensorStation = new MultiSensorStationBridge(new TemperatureSensorBridge(), new HumiditySensorBridge());
        multiSensorStation.measure();
    }
}
