package com.example.monitoringSystem.lab2Patterns.bridge.BridgePatternMessure;

// Extended abstraction - Weather Station
public class WeatherStationB extends MeasurementStationB {
    public WeatherStationB(SensorB... sensorBS) {
        super(sensorBS);
    }

    @Override
    protected String getStationType() {
        return "Weather Station";
    }
}

