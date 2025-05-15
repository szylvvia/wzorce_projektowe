package com.example.monitoringSystem.lab2Patterns.decorator.Sensor;

public class DigitalSensorSensor extends SensorSensorDecorator {

    public DigitalSensorSensor(SensorSensor sensorSensor) {
        super(sensorSensor);
    }

    @Override
    public void calibrateSensor() {
        super.calibrateSensor();
        System.out.println("Digital sensor calibrated...");
    }
}
