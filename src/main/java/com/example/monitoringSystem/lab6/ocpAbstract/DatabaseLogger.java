package com.example.monitoringSystem.lab6.ocpAbstract;

public class DatabaseLogger implements DataLogger {
    @Override
    public void log(String data) {
        System.out.println("Logging to database: " + data);
    }
}

