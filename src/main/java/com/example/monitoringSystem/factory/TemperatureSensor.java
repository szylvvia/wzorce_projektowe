package com.example.monitoringSystem.factory;

public class TemperatureSensor implements Sensor {
    @Override
    public String getDetails() {
        return "Czujnik temperatury";
    }
}
