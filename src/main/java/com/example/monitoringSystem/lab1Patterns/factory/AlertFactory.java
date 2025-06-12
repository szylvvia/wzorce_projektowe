package com.example.monitoringSystem.lab1Patterns.factory;

//Tydzień 2, Wzorzec Factory 3
//Factory do tworzenia różnych typów alertów w systemie monitoringu
//Centralizuje proces tworzenia objektów alertów na podstawie typu
public class AlertFactory {
    public static Alert createAlert(String type) {
        switch(type) {
            case "HighTemperature":
                return new HighTemperatureAlert();
            case "HighHumidity":
                return new HighHumidityAlert();
            case "HighPressure":
                return new HighPressureAlert();
            default:                throw new IllegalArgumentException("Nieznany typ alertu");
        }
    }
}
//Koniec, Tydzień 2, Wzorzec Factory 3
