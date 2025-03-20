package com.example.monitoringSystem.lab1Patterns.factory;

public class HumiditySensor implements SensorF {
    @Override
    public String getDetails() {
        return "Czujnik wilgotności";
    }
}
