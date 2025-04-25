package com.example.monitoringSystem.lab6.ocpData;

public class EmailAlert implements AlertStrategy {
    @Override
    public void send(String message) {
        System.out.println("[EMAIL] " + message);
    }
}

