package com.example.monitoringSystem.lab5Patterns.state.StationState;

public class IdleState implements StationState {
    @Override
    public void handleState() {
        System.out.println("Monitoring Station is idle. Awaiting activation.");
    }
}
