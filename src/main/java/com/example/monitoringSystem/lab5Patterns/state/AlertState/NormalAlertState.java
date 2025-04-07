package com.example.monitoringSystem.lab5Patterns.state.AlertState;

public class NormalAlertState implements AlertState {
    @Override
    public void alert() {
        System.out.println("Alert Level: Normal. No action required.");
    }
}