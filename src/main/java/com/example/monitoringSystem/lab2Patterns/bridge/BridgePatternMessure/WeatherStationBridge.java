package com.example.monitoringSystem.lab2Patterns.bridge.BridgePatternMessure;

// Extended abstraction - Weather Station
public class WeatherStationBridge extends MeasurementStationBridge {
    public WeatherStationBridge(SensorBridge... sensorBridges) {
        super(sensorBridges);
    }

    @Override
    protected String getStationType() {
        return "Weather Station";
    }
}

