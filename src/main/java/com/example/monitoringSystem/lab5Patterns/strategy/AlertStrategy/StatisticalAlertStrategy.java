package com.example.monitoringSystem.lab5Patterns.strategy.AlertStrategy;

public class StatisticalAlertStrategy implements AlertTriggerStrategy {
    @Override
    public boolean shouldTrigger(double sensorValue, double threshold) {

        return Math.abs(sensorValue - threshold) > 10;
    }
}