package com.example.monitoringSystem.lab7.dip.dipK;

public class AlertService {
    private final NotificationSender sender;

    public AlertService(NotificationSender sender) {
        this.sender = sender;
    }

    public void triggerAlert(String alert) {
        sender.send(alert);
    }
}

