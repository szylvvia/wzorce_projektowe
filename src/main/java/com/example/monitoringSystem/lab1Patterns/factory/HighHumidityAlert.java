package com.example.monitoringSystem.lab1Patterns.factory;

//Tydzień 2, Alert wysokiej wilgotności dla wzorca Factory
//Implementacja alertu dla przekroczenia poziomu wilgotności
//Jeden z produktów rodziny alertów tworzonych przez AlertFactory
public class HighHumidityAlert implements Alert {
    @Override
    public String getMessage() {
        return "Wykryto wysoką wilgotność!";
    }
}
//Koniec, Tydzień 2, Alert wysokiej wilgotności
