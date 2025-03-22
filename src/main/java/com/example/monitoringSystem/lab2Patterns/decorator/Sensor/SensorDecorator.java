package com.example.monitoringSystem.lab2Patterns.decorator.Sensor;

public class SensorDecorator implements SensorD {
    protected SensorD sensorD;

    public SensorDecorator(SensorD sensorD) {
        this.sensorD = sensorD;
    }

    @Override
    public void calibrateSensor() {
        this.sensorD.calibrateSensor();
    }
}
