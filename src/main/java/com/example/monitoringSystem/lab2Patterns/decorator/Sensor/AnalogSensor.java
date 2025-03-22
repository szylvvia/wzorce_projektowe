package com.example.monitoringSystem.lab2Patterns.decorator.Sensor;

public class AnalogSensor extends SensorDecorator {

    public AnalogSensor(SensorD sensorD) {
        super(sensorD);
    }

    @Override
    public void calibrateSensor() {
        super.calibrateSensor();
        System.out.println("Analog sensor calibrated...");
    }
}
