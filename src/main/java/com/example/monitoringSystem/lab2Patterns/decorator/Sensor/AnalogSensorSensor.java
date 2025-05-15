package com.example.monitoringSystem.lab2Patterns.decorator.Sensor;

public class AnalogSensorSensor extends SensorSensorDecorator {

    public AnalogSensorSensor(SensorSensor sensorSensor) {
        super(sensorSensor);
    }

    @Override
    public void calibrateSensor() {
        super.calibrateSensor();
        System.out.println("Analog sensor calibrated...");
    }
}
