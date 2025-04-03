package com.example.monitoringSystem.lab4Patterns.iterator;

public class CalibrationHistory {
    private double[] history = new double[50];
    private int index = 0;

    public void addCalibration(double value) {
        if (index < history.length) {
            history[index++] = value;
        }
    }

    public MyIterator<Double> createIterator() {
        return new CalibrationHistoryIterator(history, index);
    }
}
