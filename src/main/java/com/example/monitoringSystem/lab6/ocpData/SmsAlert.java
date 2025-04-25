package com.example.monitoringSystem.lab6.ocpData;

public class SmsAlert implements AlertStrategy {
    @Override
    public void send(String message) {
        System.out.println("[SMS] " + message);
    }
}
