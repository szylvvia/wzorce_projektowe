package com.example.monitoringSystem.factory;

public class HighPressureAlert implements Alert {
    @Override
    public String getMessage() {
        return "Wykryto wysokie ciśnienie!";
    }
}
