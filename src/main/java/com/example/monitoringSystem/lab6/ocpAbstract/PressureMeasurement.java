package com.example.monitoringSystem.lab6.ocpAbstract;

public class PressureMeasurement implements MeasurementStrategy {
    @Override
    public String performMeasurement() {
        return "Pressure: 1013 hPa";
    }
}

