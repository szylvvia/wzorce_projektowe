package com.example.monitoringSystem.lab1Patterns.factory;

//Tydzień 2, Alert wysokiego ciśnienia dla wzorca Factory
//Konkretna implementacja alertu ciśnieniowego
//Rozszerza rodzinę alertów o monitorowanie ciśnienia atmosferycznego
public class HighPressureAlert implements Alert {
    @Override
    public String getMessage() {
        return "Wykryto wysokie ciśnienie!";
    }
}
//Koniec, Tydzień 2, Alert wysokiego ciśnienia
