package com.example.monitoringSystem.lab2Patterns.adapter;

public class TemperatureUnitAdapter implements TemperatureAdapter {
    private final TemperatureSensor sensor;

    public TemperatureUnitAdapter(TemperatureSensor sensor) {
        this.sensor = sensor;
    }

    public double getTemperatureInFahrenheit() {
        return (sensor.getTemperature() * 9 / 5) + 32;
    }

    public double getTemperatureInKelvin() {
        return sensor.getTemperature() + 273.15;
    }
}
