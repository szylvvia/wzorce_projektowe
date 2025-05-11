package com.example.monitoringSystem.lab7.liskov.liskovK;

public class AirMonitoringStation extends MonitoringStation {
    public AirMonitoringStation(String location) {
        super(location);
    }

    @Override
    public void collectData() {
        System.out.println("Air quality data collected at " + location);
    }
}
