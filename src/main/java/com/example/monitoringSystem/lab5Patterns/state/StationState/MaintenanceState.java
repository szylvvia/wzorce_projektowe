package com.example.monitoringSystem.lab5Patterns.state.StationState;

public class MaintenanceState implements StationState {
    @Override
    public void handleState() {
        System.out.println("Monitoring Station is under maintenance.");
    }
}
