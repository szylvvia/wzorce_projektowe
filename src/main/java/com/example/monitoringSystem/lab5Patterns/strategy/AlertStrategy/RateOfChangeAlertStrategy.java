package com.example.monitoringSystem.lab5Patterns.strategy.AlertStrategy;

public class RateOfChangeAlertStrategy implements AlertTriggerStrategy {
    private double previousValue = Double.NaN;

    @Override
    public boolean shouldTrigger(double sensorValue, double threshold) {
        if (Double.isNaN(previousValue)) {
            previousValue = sensorValue;
            return false;
        }
        boolean triggered = (sensorValue - previousValue) > threshold;
        previousValue = sensorValue;
        return triggered;
    }
}
