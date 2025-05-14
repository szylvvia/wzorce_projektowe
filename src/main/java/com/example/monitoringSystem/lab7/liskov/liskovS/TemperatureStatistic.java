package com.example.monitoringSystem.lab7.liskov.liskovS;

import java.util.List;

public class TemperatureStatistic extends Statistic{
    public TemperatureStatistic(List<Double> values, double threshold) {
        super(values, threshold);
    }

    @Override
    boolean isCritical() {
        return getAverage() > getThreshold();
    }

    @Override
    void printMessageAboutStatistic() {
        if (isCritical()) {
            System.out.println("[CRITICAL TEMPERATURE] Krytyczny poziom temperatury! Temperatura przekracza próg!");
        } else {
            System.out.println("[OK TEMPERATURE ] Temperatura w normie.");
        }
    }

}
