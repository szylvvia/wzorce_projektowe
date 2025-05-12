package com.example.monitoringSystem.lab7.isp.ispM;

public class FullSensorImpl implements ISensor {
    @Override
    public double readValue() {
        System.out.println("Reading value...");
        return 25.0;
    }

    @Override
    public void calibrate() {
        System.out.println("Calibrating...");
    }

    @Override
    public void reset() {
        System.out.println("Resetting sensor...");
    }

    @Override
    public void displayStatus() {
        System.out.println("Status: OK");
    }
}
