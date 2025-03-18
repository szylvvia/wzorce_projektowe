package com.example.monitoringSystem.lab1Patterns.factory;

public class HighPressureAlert implements Alert {
    @Override
    public String getMessage() {
        return "Wykryto wysokie ciśnienie!";
    }
}
