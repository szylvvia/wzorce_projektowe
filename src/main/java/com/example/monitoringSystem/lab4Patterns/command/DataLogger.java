package com.example.monitoringSystem.lab4Patterns.command;

public class DataLogger {
    public void startLogging() {
        System.out.println("Data logging started.");
    }

    public void stopLogging() {
        System.out.println("Data logging stopped.");
    }

    public void clearLog() {
        System.out.println("Data log cleared.");
    }
}
