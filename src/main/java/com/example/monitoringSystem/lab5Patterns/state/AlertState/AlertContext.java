package com.example.monitoringSystem.lab5Patterns.state.AlertState;

public class AlertContext {
    private AlertState currentAlertState;

    public void setAlertState(AlertState state) {
        this.currentAlertState = state;
    }

    public void displayAlert() {
        if (currentAlertState != null) {
            currentAlertState.alert();
        } else {
            System.out.println("No alert state set.");
        }
    }
}