package com.example.monitoringSystem.lab5Patterns.observer;

public class HumidityObserver implements Observer {
    @Override
    public void update(float temperature, float pressure, float humidity) {
        System.out.println("HumidityObserver: Humidity updated to " + humidity + "%");
    }
}