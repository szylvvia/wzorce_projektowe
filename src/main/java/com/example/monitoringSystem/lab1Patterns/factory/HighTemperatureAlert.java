package com.example.monitoringSystem.lab1Patterns.factory;

//Tydzień 2, Alert wysokiej temperatury dla wzorca Factory
//Konkretna implementacja alertu dla przekroczenia temperatury
//Produkt fabryki AlertFactory dla alertów temperaturowych
public class HighTemperatureAlert implements Alert {
    @Override
    public String getMessage() {
        return "Wykryto wysoką temperaturę!";
    }
}
//Koniec, Tydzień 2, Alert wysokiej temperatury
