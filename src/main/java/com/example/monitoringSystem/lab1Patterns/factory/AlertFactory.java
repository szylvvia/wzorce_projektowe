package com.example.monitoringSystem.lab1Patterns.factory;

public class AlertFactory {
    public static Alert createAlert(String type) {
        switch(type) {
            case "HighTemperature":
                return new HighTemperatureAlert();
            case "HighHumidity":
                return new HighHumidityAlert();
            case "HighPressure":
                return new HighPressureAlert();
            default:
                throw new IllegalArgumentException("Nieznany typ alertu");
        }
    }
}
