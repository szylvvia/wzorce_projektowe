package com.example.monitoringSystem.lab3Patterns.facade.MeasurementFacade;

public class HumiditySensorF implements SensorFacade{
    @Override
    public double measure() {
        return 65.0; // Przykładowa wilgotność
    }
}
