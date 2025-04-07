package com.example.monitoringSystem.lab5Patterns.strategy.AlertStrategy;

public interface AlertTriggerStrategy {
    boolean shouldTrigger(double sensorValue, double threshold);
}
