package com.example.monitoringSystem.lab1Patterns.factory;

public class PressureSensor implements SensorF {
    @Override
    public String getDetails() {
        return "Czujnik ciśnienia";
    }
}
