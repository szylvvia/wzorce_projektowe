package com.example.monitoringSystem.lab1Patterns.factory;

public class PressureSensor implements Sensor {
    @Override
    public String getDetails() {
        return "Czujnik ciśnienia";
    }
}
