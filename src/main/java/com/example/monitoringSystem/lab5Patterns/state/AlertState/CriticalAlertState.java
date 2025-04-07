package com.example.monitoringSystem.lab5Patterns.state.AlertState;

public class CriticalAlertState implements AlertState {
    @Override
    public void alert() {
        System.out.println("Alert Level: Critical! Immediate action required!");
    }
}