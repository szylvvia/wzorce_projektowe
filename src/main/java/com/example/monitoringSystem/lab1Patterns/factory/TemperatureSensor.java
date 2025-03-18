package com.example.monitoringSystem.lab1Patterns.factory;

public class TemperatureSensor implements Sensor {
    @Override
    public String getDetails() {
        return "Czujnik temperatury";
    }
}
