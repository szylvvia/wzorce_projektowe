package com.example.monitoringSystem.lab2Patterns.decorator.Sensor;

public class AllPurposeSensorSensor implements SensorSensor {
    @Override
    public void calibrateSensor() {
        System.out.println("Calibrating All Purpose Sensor");
    }
}
