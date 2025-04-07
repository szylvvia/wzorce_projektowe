package com.example.monitoringSystem.lab5Patterns.strategy.AlertStrategy;

public class AlertEvaluator {
    public boolean evaluate(double sensorValue, double threshold, AlertTriggerStrategy strategy) {
        return strategy.shouldTrigger(sensorValue, threshold);
    }
}
