package com.example.monitoringSystem.lab3Patterns.facade.MeasurementFacade;

public class PressureSensorF implements SensorFacade{
    @Override
    public double measure() {
        return 1013.25; // Przykładowe ciśnienie
    }
}
