package com.example.monitoringSystem.factory;

public class HighTemperatureAlert implements Alert {
    @Override
    public String getMessage() {
        return "Wykryto wysoką temperaturę!";
    }
}
