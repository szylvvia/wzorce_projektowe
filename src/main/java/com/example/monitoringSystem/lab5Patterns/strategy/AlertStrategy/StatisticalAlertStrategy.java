package com.example.monitoringSystem.lab5Patterns.strategy.AlertStrategy;

public class StatisticalAlertStrategy implements AlertTriggerStrategy {
    @Override
    public boolean shouldTrigger(double sensorValue, double threshold) {
        int sensorTriggerValue = 10;
        return Math.abs(sensorValue - threshold) > sensorTriggerValue;
    }
}