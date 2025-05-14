package com.example.monitoringSystem.lab7.isp.ispS.isp2;

public class WeeklyNoisyLevelStats implements NoisyLevelStats {
    @Override
    public void calculateNoiseValue() {
        System.out.println("Calculating weekly noise level statistics: " + Math.round(Math.random() * 100.0) / 100.0);
    }
}
