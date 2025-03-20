package com.example.monitoringSystem.lab2Patterns.bridge.BridgePatternMessure;

public class MultiSensorStationB extends MeasurementStationB {
    public MultiSensorStationB(Sensor... sensors) {
        super(sensors);
    }

    @Override
    protected String getStationType() {
        return "Multi-Sensor Station";
    }
}