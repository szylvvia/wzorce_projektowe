package com.example.monitoringSystem.lab2Patterns.adapter;

public class MmHgPressureAdapter implements PressureAdapter {
    private final PressureSensor sensor;

    public MmHgPressureAdapter(PressureSensor sensor) {
        this.sensor = sensor;
    }

    public double getPressure() {
        return sensor.getPressure() * 0.750062;
    }
}

