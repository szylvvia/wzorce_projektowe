package com.example.monitoringSystem.lab1Patterns.factory;

public class HumiditySensor implements Sensor {
    @Override
    public String getDetails() {
        return "Czujnik wilgotności";
    }
}
