package com.example.monitoringSystem.lab6.ocpAbstract2;

public class PressureSensor extends ASensor {
    private double pressure;
    private String location;

    public PressureSensor(Double pressure, String location) {
        this.pressure = pressure;
        this.location = location;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public void measure() {
        System.out.println("Measuring pressure: " + pressure + " at " + location);
    }

    @Override
    public void calibrate() {
        System.out.println("Calibrating pressure sensor at: " + location);
    }
}
