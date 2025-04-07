package com.example.monitoringSystem.lab5Patterns.strategy.AlertStrategy;

public class ThresholdAlertStrategy implements AlertTriggerStrategy {
    @Override
    public boolean shouldTrigger(double sensorValue, double threshold) {
        return sensorValue > threshold;
    }
}