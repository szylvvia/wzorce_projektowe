package com.example.monitoringSystem.lab5Patterns.observer;

public class PressureObserver implements Observer {
    @Override
    public void update(float temperature, float pressure, float humidity) {
        System.out.println("PressureObserver: Pressure updated to " + pressure + " hPa");
    }
}
