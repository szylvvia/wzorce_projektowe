package com.example.monitoringSystem.lab3Patterns.facade.AlertFacade;

public class EmailAlert implements AlertSystem {
    @Override
    public void sendAlert(String message) {
        System.out.println("Email Alert: " + message);
    }
}
