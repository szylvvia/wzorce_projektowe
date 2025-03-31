package com.example.monitoringSystem.lab4Patterns.memento.Alert;

public class AlertMemento {
    private final String alertMessage;

    public AlertMemento(String alertMessage) {
        this.alertMessage = alertMessage;
    }

    public String getAlertMessage() {
        return alertMessage;
    }
}