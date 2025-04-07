package com.example.monitoringSystem.lab5Patterns.state.StationState;

public class ActiveState implements StationState {
    @Override
    public void handleState() {
        System.out.println("Monitoring Station is active and monitoring environmental parameters.");
    }
}
