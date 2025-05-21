package com.example.monitoringSystem.lab3Patterns.facade.MeasurementFacade;

public class HumiditySensorFacade implements SensorFacade{
    @Override
    public double measure() {
        return 65.0;
    }
}
