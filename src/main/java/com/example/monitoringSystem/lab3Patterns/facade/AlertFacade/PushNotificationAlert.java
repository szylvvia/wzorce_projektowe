package com.example.monitoringSystem.lab3Patterns.facade.AlertFacade;

public class PushNotificationAlert implements AlertSystem {
    @Override
    public void sendAlert(String message) {
        System.out.println("Push Notification: " + message);
    }
}