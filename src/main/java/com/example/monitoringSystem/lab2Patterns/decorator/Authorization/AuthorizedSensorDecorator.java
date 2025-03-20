package com.example.monitoringSystem.lab2Patterns.decorator.Authorization;

public class AuthorizedSensorDecorator implements SensorAuth {
    private final SensorAuth decoratedSensor;
    private final boolean hasPermission;

    public AuthorizedSensorDecorator(SensorAuth decoratedSensor, boolean hasPermission) {
        this.decoratedSensor = decoratedSensor;
        this.hasPermission = hasPermission;
    }

    @Override
    public void measure() {
        if (!hasPermission) {
            throw new SecurityException("Access denied! You do not have permission to use this sensor.");
        }
        decoratedSensor.measure();
    }
}