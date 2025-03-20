package com.example.monitoringSystem.lab2Patterns.bridge.BridgePatternMessure;

// Extended abstraction - Industrial Station
public class IndustrialStationB extends MeasurementStationB {
    public IndustrialStationB(SensorB... sensorBS) {
        super(sensorBS);
    }

    @Override
    protected String getStationType() {
        return "Industrial Station";
    }
}
