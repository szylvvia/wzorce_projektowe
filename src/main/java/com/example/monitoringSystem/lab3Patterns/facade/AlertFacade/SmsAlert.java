package com.example.monitoringSystem.lab3Patterns.facade.AlertFacade;

public class SmsAlert implements AlertSystem {
    @Override
    public void sendAlert(String message) {
        System.out.println("SMS Alert: " + message);
    }
}
