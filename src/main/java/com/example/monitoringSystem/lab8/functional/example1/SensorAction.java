package com.example.monitoringSystem.lab8.functional.example1;

@FunctionalInterface
public interface SensorAction {
    void execute(String sensorName, double value);
}
