package com.example.monitoringSystem.lab4Patterns.command;

public class AlertManager {
    public void sendSmsAlert(String message) {
        System.out.println("[SMS Alert] " + message);
    }

    public void sendEmailAlert(String message) {
        System.out.println("[Email Alert] " + message);
    }

    public void sendPushAlert(String message) {
        System.out.println("[Push Alert] " + message);
    }
}