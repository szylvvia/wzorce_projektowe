package com.example.monitoringSystem.lab7.isp.ispS.isp2;

public class WeeklyNoisyLevelStats implements NoisyLevelStats {
    @Override
    public void calculateNoiseValue() {
        double roundingFactor = 100.0;
        System.out.println("Calculating weekly noise level statistics: " + Math.round(Math.random() * roundingFactor) / roundingFactor);
    }
}
