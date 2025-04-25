package com.example.monitoringSystem.lab6.srpMemento;

public class AlertMemento {

    //przechowywanie stanu alertu
    private final String alertMessage;

    public AlertMemento(String alertMessage) {
        this.alertMessage = alertMessage;
    }

    public String getAlertMessage() {
        return alertMessage;
    }
}