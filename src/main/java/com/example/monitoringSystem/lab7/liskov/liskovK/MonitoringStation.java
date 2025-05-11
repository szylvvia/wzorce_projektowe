package com.example.monitoringSystem.lab7.liskov.liskovK;

public abstract class MonitoringStation {
    protected String location;

    public MonitoringStation(String location) {
        this.location = location;
    }

    public abstract void collectData();
}