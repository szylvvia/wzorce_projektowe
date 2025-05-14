package com.example.monitoringSystem.lab7.isp.ispS.isp3;

public class AdvancedAirStation implements AirStation, SensorMaintenance {
    @Override
    public void monitorAirPollution() {
        System.out.println("[ADV AIR ST] Monitoring air pollution... | Air pollution:"+ Math.round(Math.random()*10));
    }

    @Override
    public void turnOn() {
        System.out.println("[ADV AIR ST] Sensor turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("[ADV AIR ST] Sensor turned off.");
    }

    @Override
    public void calibrate() {
        System.out.println("[ADV AIR ST] Sensor calibrated.");
    }
}
