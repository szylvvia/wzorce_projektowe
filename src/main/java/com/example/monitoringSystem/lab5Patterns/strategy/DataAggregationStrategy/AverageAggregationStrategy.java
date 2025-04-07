package com.example.monitoringSystem.lab5Patterns.strategy.DataAggregationStrategy;

import java.util.Arrays;

public class AverageAggregationStrategy implements DataAggregationStrategy {
    @Override
    public double aggregate(double[] data) {
        double sum = 0;
        for (double d : data) {
            sum += d;
        }
        return data.length > 0 ? sum / data.length : 0;
    }
}
