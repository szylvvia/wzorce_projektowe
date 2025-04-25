package com.example.monitoringSystem.lab6.ocpAbstract;

public class TemperatureMeasurement implements MeasurementStrategy {
    @Override
    public String performMeasurement() {
        return "Temperature: 22.5 °C";
    }
}

