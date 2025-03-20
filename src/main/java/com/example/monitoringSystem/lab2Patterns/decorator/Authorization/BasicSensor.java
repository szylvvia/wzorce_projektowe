package com.example.monitoringSystem.lab2Patterns.decorator.Authorization;

public class BasicSensor implements SensorAuth {
    private final String name;

    public BasicSensor(String name) {
        this.name = name;
    }

    @Override
    public void measure() {
        System.out.println("Measuring data from sensor: " + name);
    }
}

