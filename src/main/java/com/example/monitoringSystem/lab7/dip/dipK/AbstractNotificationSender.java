package com.example.monitoringSystem.lab7.dip.dipK;

public abstract class AbstractNotificationSender implements NotificationSender {
    protected String recipient;

    public AbstractNotificationSender(String recipient) {
        this.recipient = recipient;
    }

    public abstract void send(String message);
}

