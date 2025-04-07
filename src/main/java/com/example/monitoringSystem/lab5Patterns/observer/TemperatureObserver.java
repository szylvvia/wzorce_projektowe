package com.example.monitoringSystem.lab5Patterns.observer;

public class TemperatureObserver implements Observer {
    @Override
    public void update(float temperature, float pressure, float humidity) {
        System.out.println("TemperatureObserver: Temperature updated to " + temperature + "°C");
    }
}