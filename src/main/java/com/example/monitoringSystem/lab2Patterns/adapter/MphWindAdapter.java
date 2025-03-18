package com.example.monitoringSystem.lab2Patterns.adapter;

public class MphWindAdapter implements WindSpeedAdapter {
    private final WindSpeedSensor sensor;

    public MphWindAdapter(WindSpeedSensor sensor) {
        this.sensor = sensor;
    }

    public double getSpeed() {
        return sensor.getSpeed() * 0.621371;
    }
}