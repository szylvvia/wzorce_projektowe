package com.example.monitoringSystem.lab7.dip.dipK;

public class AverageMeasurementProcessor extends AbstractMeasurementProcessor {
    @Override
    public double process(double[] values) {
        double sum = 0;
        for (double val : values) sum += val;
        return sum / values.length;
    }
}

