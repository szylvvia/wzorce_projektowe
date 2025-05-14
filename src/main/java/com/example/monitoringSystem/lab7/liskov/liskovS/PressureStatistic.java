package com.example.monitoringSystem.lab7.liskov.liskovS;

import java.util.List;

public class PressureStatistic extends Statistic {

    public PressureStatistic(List<Double> values, double threshold) {
        super(values, threshold);
    }

    @Override
    boolean isCritical() {
        return getMax() > getThreshold() || getAverage() > getThreshold();
    }

    @Override
    void printMessageAboutStatistic() {
        if (isCritical()) {
            System.out.println("[CRITICAL PRESSURE] Pressure is above threshold or maximum pressure is above threshold!");
        } else {
            System.out.println("[OK PRESSURE] Pressure is within the threshold.");
        }
    }
}
