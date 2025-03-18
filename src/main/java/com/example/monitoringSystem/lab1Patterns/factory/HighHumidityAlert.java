package com.example.monitoringSystem.lab1Patterns.factory;

public class HighHumidityAlert implements Alert {
    @Override
    public String getMessage() {
        return "Wykryto wysoką wilgotność!";
    }
}
