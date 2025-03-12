package com.example.monitoringSystem.factory;

public class HighHumidityAlert implements Alert {
    @Override
    public String getMessage() {
        return "Wykryto wysoką wilgotność!";
    }
}
