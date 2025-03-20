package com.example.monitoringSystem.lab2Patterns.adapter;

public class TemperatureUnitAdapter extends CelsiusSensor implements TemperatureAdapter {
    private final TemperatureSensor sensor;

    public TemperatureUnitAdapter(TemperatureSensor sensor) {
        this.sensor = sensor;
    }

    @Override
    public double getTemperatureInFahrenheit() {
        return (sensor.getTemperature() * 9 / 5) + 32;
    }

    @Override
    public double getTemperatureInKelvin() {
        return sensor.getTemperature() + 273.15;
    }
}
