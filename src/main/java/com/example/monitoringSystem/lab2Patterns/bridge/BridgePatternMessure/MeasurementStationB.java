package com.example.monitoringSystem.lab2Patterns.bridge.BridgePatternMessure;


import java.util.ArrayList;
import java.util.List;

// Abstraction - Measurement Station
public abstract class MeasurementStationB {
    protected List<Sensor> sensors = new ArrayList<>();

    public MeasurementStationB(Sensor... sensors) {
        for (Sensor sensor : sensors) {
            this.sensors.add(sensor);
        }
    }

    public String measure() {
        StringBuilder result = new StringBuilder(getStationType() + " starting measurements...<br>");
        for (Sensor sensor : sensors) {
            result.append(sensor.collectData()).append("<br>");
        }
        return result.toString();
    }

    protected abstract String getStationType();
}