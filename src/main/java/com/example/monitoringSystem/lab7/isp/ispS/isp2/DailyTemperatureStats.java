package com.example.monitoringSystem.lab7.isp.ispS.isp2;

public class DailyTemperatureStats implements TemperatureStats {

    @Override
    public void calculateTemperatureValue() {
        double val = Math.random() * 100;
        System.out.println("Calculated temperature value: " + Math.round(val * 40) / 40.0);
    }

}
