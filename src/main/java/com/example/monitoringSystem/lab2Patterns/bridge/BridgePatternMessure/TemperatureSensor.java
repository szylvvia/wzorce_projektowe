package com.example.monitoringSystem.lab2Patterns.bridge.BridgePatternMessure;

// Concrete sensor - Temperature sensor
public class TemperatureSensor implements Sensor {
    @Override
    public String collectData() {
        return "Collecting temperature data";
    }
}

