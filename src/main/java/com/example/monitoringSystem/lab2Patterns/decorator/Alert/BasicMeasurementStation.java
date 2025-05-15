package com.example.monitoringSystem.lab2Patterns.decorator.Alert;

public class BasicMeasurementStation implements MeasurementStation {
    @Override
    public String measure() {
        return "Measuring station is collecting data...<br>";
    }
}
