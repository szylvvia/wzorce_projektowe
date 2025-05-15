package com.example.monitoringSystem.lab3Patterns.facade.MeasurementFacade;

public class TemperatureSensorFacade implements SensorFacade{
    @Override
    public double measure() {
        return 22.5; // Przykładowa temperatura
    }
}
