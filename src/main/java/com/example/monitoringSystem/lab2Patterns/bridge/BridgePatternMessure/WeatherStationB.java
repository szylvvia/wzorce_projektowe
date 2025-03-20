package com.example.monitoringSystem.lab2Patterns.bridge.BridgePatternMessure;

// Extended abstraction - Weather Station
public class WeatherStationB extends MeasurementStationB {
    public WeatherStationB(Sensor... sensors) {
        super(sensors);
    }

    @Override
    protected String getStationType() {
        return "Weather Station";
    }
}

