package com.example.monitoringSystem.factory;

public class HumiditySensor implements Sensor {
    @Override
    public String getDetails() {
        return "Czujnik wilgotności";
    }
}
