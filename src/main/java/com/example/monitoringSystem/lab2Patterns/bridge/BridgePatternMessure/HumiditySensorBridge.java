package com.example.monitoringSystem.lab2Patterns.bridge.BridgePatternMessure;

// Concrete sensor - Humidity sensor
public class HumiditySensorBridge implements SensorBridge {
    @Override
    public String collectData() {
        return "Collecting humidity data";
    }
}