package com.example.monitoringSystem.lab2Patterns.decorator.Sensor;

public class DigitalSensor extends SensorDecorator {

    public DigitalSensor(SensorD sensorD) {
        super(sensorD);
    }

    @Override
    public void calibrateSensor() {
        super.calibrateSensor();
        System.out.println("Digital sensor calibrated...");
    }
}
