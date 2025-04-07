package com.example.monitoringSystem.lab5Patterns.state.SensorState;

public class SensorContext {
    private SensorState currentState;

    public void setState(SensorState state) {
        this.currentState = state;
    }

    public void displayStatus() {
        if (currentState != null) {
            currentState.reportStatus();
        } else {
            System.out.println("Sensor state not set.");
        }
    }
}
