package com.example.monitoringSystem.lab5Patterns.state.SensorState;

public class CalibrationState implements SensorState {
    @Override
    public void reportStatus() {
        System.out.println("Sensor is calibrating.");
    }
}
