package com.example.monitoringSystem.lab5Patterns.state.SensorState;

public class FaultState implements SensorState {
    @Override
    public void reportStatus() {
        System.out.println("Sensor fault detected!");
    }
}
