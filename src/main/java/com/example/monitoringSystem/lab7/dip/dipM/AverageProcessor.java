package com.example.monitoringSystem.lab7.dip.dipM;

public class AverageProcessor  extends AbstractProcessor {
    @Override
    public double process(double[] data) {
        double sum = 0;
        for (double d : data) sum += d;
        return sum / data.length;
    }
}