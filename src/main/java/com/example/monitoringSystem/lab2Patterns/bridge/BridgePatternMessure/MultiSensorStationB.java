package com.example.monitoringSystem.lab2Patterns.bridge.BridgePatternMessure;

public class MultiSensorStationB extends MeasurementStationB {
    public MultiSensorStationB(SensorB... sensorBS) {
        super(sensorBS);
    }

    @Override
    protected String getStationType() {
        return "Multi-Sensor Station";
    }
}