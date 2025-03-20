package com.example.monitoringSystem.lab2Patterns.decorator.Alart;

public class BasicMeasurementStation implements MeasurementStation {
    @Override
    public String measure() {
        return "Measuring station is collecting data...<br>";
    }
}
