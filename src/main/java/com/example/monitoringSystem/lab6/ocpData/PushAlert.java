package com.example.monitoringSystem.lab6.ocpData;

public class PushAlert implements AlertStrategy {
    @Override
    public void send(String message) {
        System.out.println("[PUSH] " + message);
    }
}

