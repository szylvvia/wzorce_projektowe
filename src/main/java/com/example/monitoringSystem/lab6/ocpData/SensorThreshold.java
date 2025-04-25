package com.example.monitoringSystem.lab6.ocpData;

public class SensorThreshold {
    private final String sensorType;
    private final double currentValue;
    private final double limit;

    public SensorThreshold(String sensorType, double currentValue, double limit) {
        this.sensorType = sensorType;
        this.currentValue = currentValue;
        this.limit = limit;
    }

    public String getSensorType() {
        return sensorType;
    }

    public double getCurrentValue() {
        return currentValue;
    }

    public double getLimit() {
        return limit;
    }
}
