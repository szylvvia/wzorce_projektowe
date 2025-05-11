package com.example.monitoringSystem.lab7.isp.ispK;

public class FileOnlyLogger implements FileLogger {
    @Override
    public void logToFile(String data) {
        System.out.println("Logging to file: " + data);
    }
}
