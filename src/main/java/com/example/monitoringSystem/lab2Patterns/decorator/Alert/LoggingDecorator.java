package com.example.monitoringSystem.lab2Patterns.decorator.Alert;

// Concrete Decorator - Logging measurements
public class LoggingDecorator extends MeasurementDecorator {
    public LoggingDecorator(MeasurementStation station) {
        super(station);
    }

    @Override
    public String measure() {
        return "Logging: Measurement started...<br>" +
                super.measure() +
                "Logging: Measurement completed.<br>";
    }
}
