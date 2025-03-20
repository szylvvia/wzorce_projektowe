package com.example.monitoringSystem.lab2Patterns.bridge.BridgePatternMessure;

// Concrete sensor - Temperature sensor
public class TemperatureSensorB implements SensorB {
    @Override
    public String collectData() {
        return "Collecting temperature data";
    }
}

