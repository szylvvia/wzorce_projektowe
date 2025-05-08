package com.example.monitoringSystem.lab7.dip.dipK;

public class EmailNotificationSender extends AbstractNotificationSender {
    public EmailNotificationSender(String recipient) {
        super(recipient);
    }

    @Override
    public void send(String message) {
        System.out.println("Sending EMAIL to " + recipient + ": " + message);
    }
}

