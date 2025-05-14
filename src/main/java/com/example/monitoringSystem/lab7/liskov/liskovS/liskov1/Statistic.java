package com.example.monitoringSystem.lab7.liskov.liskovS.liskov1;

import java.util.List;

public class Statistic {
    private List<Double> values;
    private double threshold;

    public List<Double> getValues() {
        return values;
    }

    public void setValues(List<Double> values) {
        this.values = values;
    }

    public double getThreshold() {
        return threshold;
    }

    public void setThreshold(double threshold) {
        this.threshold = threshold;
    }

    public Statistic(List<Double> values, double threshold) {
        this.values = values;
        this.threshold = threshold;
    }

    double getAverage() {
        double sum = 0;
        for (double value : values) {
            sum += value;
        }
        return sum / values.size();
    }

    double getMax() {
        double max = Double.MIN_VALUE;
        for (double value : values) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    boolean isCritical() {
        return getMax() > threshold;
    }

    void printMessageAboutStatistic() {
        if (isCritical()) {
            System.out.println("[CRITICAL] Statistic value is above threshold!");
        } else {
            System.out.println("[OK] Statistic value is within the threshold.");
        }
    }
}
