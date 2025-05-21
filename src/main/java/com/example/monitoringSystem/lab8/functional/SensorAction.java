package com.example.monitoringSystem.lab8.functional;

@FunctionalInterface
public interface SensorAction {
    void execute(String sensorName, double value);
}
