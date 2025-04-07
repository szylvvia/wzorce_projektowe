package com.example.monitoringSystem.lab5Patterns.state.AlertState;

public class WarningAlertState implements AlertState {
    @Override
    public void alert() {
        System.out.println("Alert Level: Warning. Monitor the situation.");
    }
}
