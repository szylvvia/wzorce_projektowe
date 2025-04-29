package com.example.monitoringSystem.lab6.ocpData2;

public class AirQualitySensor implements ISensor {
    private final String location;

    public AirQualitySensor(String location) {
        this.location = location;
    }

    @Override
    public void readMeasurement() {
        double value = Math.random() * 100;
        System.out.println("[SENSOR] Air Quality Sensor at " + location + " read value: " + value);
    }
}
