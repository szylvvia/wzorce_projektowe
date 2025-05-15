package com.example.monitoringSystem.lab2Patterns.bridge.BridgePatternMessure;


import java.util.ArrayList;
import java.util.List;

// Abstraction - Measurement Station
public abstract class MeasurementStationBridge {
    protected List<SensorBridge> sensorBridges = new ArrayList<>();

    public MeasurementStationBridge(SensorBridge... sensorBridges) {
        for (SensorBridge sensorBridge : sensorBridges) {
            this.sensorBridges.add(sensorBridge);
        }
    }

    public String measure() {
        StringBuilder result = new StringBuilder(getStationType() + " starting measurements...<br>");
        for (SensorBridge sensorBridge : sensorBridges) {
            result.append(sensorBridge.collectData()).append("<br>");
        }
        return result.toString();
    }

    protected abstract String getStationType();
}