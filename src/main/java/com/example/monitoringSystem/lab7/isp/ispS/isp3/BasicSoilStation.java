package com.example.monitoringSystem.lab7.isp.ispS.isp3;

public class BasicSoilStation implements SoilStation, SensorMaintenance {
    @Override
    public void monitorSoilHumidity() {
        System.out.println("Monitoring soil humidity... | Soil humidity: "+ Math.round(Math.random()*100)+" %");
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on the soil station...");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off the soil station...");
    }

    @Override
    public void calibrate() {
        System.out.println("Calibrating the soil station...");
    }
}
