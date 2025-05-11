package com.example.monitoringSystem.lab7.liskov.liskovK;

public class SensorFailureHandler extends EventHandler {
    @Override
    public void handleEvent(String event) {
        System.out.println("Handling sensor failure: " + event);
    }
}
