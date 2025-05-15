package com.example.monitoringSystem.lab2Patterns.decorator.Sensor;

public class SensorSensorDecorator implements SensorSensor {
    protected SensorSensor sensorSensor;

    public SensorSensorDecorator(SensorSensor sensorSensor) {
        this.sensorSensor = sensorSensor;
    }

    @Override
    public void calibrateSensor() {
        this.sensorSensor.calibrateSensor();
    }
}
