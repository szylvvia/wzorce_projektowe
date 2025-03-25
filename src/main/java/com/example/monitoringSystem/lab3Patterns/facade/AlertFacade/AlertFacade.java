package com.example.monitoringSystem.lab3Patterns.facade.AlertFacade;

public class AlertFacade {
    private final AlertSystem smsAlert;
    private final AlertSystem emailAlert;
    private final AlertSystem pushAlert;

    public AlertFacade() {
        this.smsAlert = new SmsAlert();
        this.emailAlert = new EmailAlert();
        this.pushAlert = new PushNotificationAlert();
    }

    public void sendSmsAlert(String message) {
        smsAlert.sendAlert(message);
    }

    public void sendEmailAlert(String message) {
        emailAlert.sendAlert(message);
    }

    public void sendPushNotification(String message) {
        pushAlert.sendAlert(message);
    }

    public void sendAllAlerts(String message) {
        smsAlert.sendAlert(message);
        emailAlert.sendAlert(message);
        pushAlert.sendAlert(message);
    }
}