package com.example.monitoringSystem.lab2Patterns.bridge.BridgePatternMessure;


import java.util.ArrayList;
import java.util.List;

// Abstraction - Measurement Station
public abstract class MeasurementStationB {
    protected List<SensorB> sensorBS = new ArrayList<>();

    public MeasurementStationB(SensorB... sensorBS) {
        for (SensorB sensorB : sensorBS) {
            this.sensorBS.add(sensorB);
        }
    }

    public String measure() {
        StringBuilder result = new StringBuilder(getStationType() + " starting measurements...<br>");
        for (SensorB sensorB : sensorBS) {
            result.append(sensorB.collectData()).append("<br>");
        }
        return result.toString();
    }

    protected abstract String getStationType();
}