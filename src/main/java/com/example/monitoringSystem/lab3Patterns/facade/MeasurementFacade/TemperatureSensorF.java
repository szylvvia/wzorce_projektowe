package com.example.monitoringSystem.lab3Patterns.facade.MeasurementFacade;

public class TemperatureSensorF implements SensorFacade{
    @Override
    public double measure() {
        return 22.5; // Przykładowa temperatura
    }
}
