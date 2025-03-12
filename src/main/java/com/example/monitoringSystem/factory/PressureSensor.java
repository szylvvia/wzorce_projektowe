package com.example.monitoringSystem.factory;

public class PressureSensor implements Sensor {
    @Override
    public String getDetails() {
        return "Czujnik ciśnienia";
    }
}
