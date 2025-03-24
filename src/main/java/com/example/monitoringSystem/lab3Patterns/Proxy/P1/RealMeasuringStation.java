package com.example.monitoringSystem.lab3Patterns.Proxy.P1;

public class RealMeasuringStation implements MeasuringStationP1 {
    public RealMeasuringStation() {
        System.out.println("Initializing Real Measuring Station...");
        try { Thread.sleep(2000); } catch (InterruptedException ignored) {}
    }

    @Override
    public void displayDataP1() {
        System.out.println("Displaying actual sensor data...");
    }

    public String getDataP1() {
        return "Virtual Proxy: Displaying actual sensor data...";
    }
}
