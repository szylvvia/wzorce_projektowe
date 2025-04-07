package com.example.monitoringSystem.lab5Patterns.strategy.DataAggregationStrategy;

public class DataAggregator {
    public double aggregateData(double[] data, DataAggregationStrategy strategy) {
        return strategy.aggregate(data);
    }
}
