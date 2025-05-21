package com.example.monitoringSystem.lab4Patterns.iterator;

public class SensorData {
    private double[] measurements = new double[100];
    private int index = 0;
    public void addMeasurement(double value) {
        if (index < measurements.length) {
            measurements[index++] = value;
        }
    }

    public MyIterator<Double> createIterator() {
        return new SensorDataIterator(measurements, index);
    }
}
