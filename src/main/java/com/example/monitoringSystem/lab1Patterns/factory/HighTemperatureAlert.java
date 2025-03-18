package com.example.monitoringSystem.lab1Patterns.factory;

public class HighTemperatureAlert implements Alert {
    @Override
    public String getMessage() {
        return "Wykryto wysoką temperaturę!";
    }
}
