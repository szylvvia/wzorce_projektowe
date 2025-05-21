package com.example.monitoringSystem.lab7.isp.ispS.isp2;

public class DailyTemperatureStats implements TemperatureStats {

    @Override
    public void calculateTemperatureValue() {
        int valueRange = 100;
        double roundingFactor = 40.0;
        double val = Math.random() * valueRange;
        System.out.println("Calculated temperature value: " + Math.round(val * roundingFactor) / roundingFactor);
    }

}
