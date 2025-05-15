package com.example.monitoringSystem.lab2Patterns.bridge.BridgePatternMessure;

// Concrete sensor - Temperature sensor
public class TemperatureSensorBridge implements SensorBridge {
    @Override
    public String collectData() {
        return "Collecting temperature data";
    }
}

