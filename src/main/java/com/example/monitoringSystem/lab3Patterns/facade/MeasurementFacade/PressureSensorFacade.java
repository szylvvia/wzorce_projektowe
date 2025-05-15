package com.example.monitoringSystem.lab3Patterns.facade.MeasurementFacade;

public class PressureSensorFacade implements SensorFacade{
    @Override
    public double measure() {
        return 1013.25; // Przykładowe ciśnienie
    }
}
