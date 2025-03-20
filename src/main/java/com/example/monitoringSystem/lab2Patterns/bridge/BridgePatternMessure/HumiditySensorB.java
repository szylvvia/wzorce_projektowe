package com.example.monitoringSystem.lab2Patterns.bridge.BridgePatternMessure;

// Concrete sensor - Humidity sensor
public class HumiditySensorB implements SensorB {
    @Override
    public String collectData() {
        return "Collecting humidity data";
    }
}