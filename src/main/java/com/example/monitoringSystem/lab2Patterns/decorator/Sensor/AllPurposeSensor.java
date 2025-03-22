package com.example.monitoringSystem.lab2Patterns.decorator.Sensor;

public class AllPurposeSensor implements SensorD {
    @Override
    public void calibrateSensor() {
        System.out.println("Calibrating All Purpose Sensor");
    }
}
