package com.example.monitoringSystem.lab4Patterns.command;

public class MeasuringStation {
    public void startMeasurement() {
        System.out.println("Measurement started.");
    }

    public void stopMeasurement() {
        System.out.println("Measurement stopped.");
    }

    public void calibrateSensor() {
        System.out.println("Sensor calibrated.");
    }
}
