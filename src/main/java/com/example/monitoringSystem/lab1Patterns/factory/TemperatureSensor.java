package com.example.monitoringSystem.lab1Patterns.factory;

public class TemperatureSensor implements SensorF {
    @Override
    public String getDetails() {
        return "Czujnik temperatury";
    }
}
