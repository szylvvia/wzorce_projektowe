package com.example.monitoringSystem.lab6.ocpAbstract2;

public class MathStatistics extends AStatistics {
    private double mean;
    private double median;

    public MathStatistics(double mean, double median) {
        this.mean = mean;
        this.median = median;
    }

    @Override
    void calculateStatistics() {
        System.out.println("Calculating statistics mean: " + mean + " and median: " + median);
    }

    @Override
    void generateReport() {
        System.out.println("Generating report with mean: " + mean + " and median: " + median);
    }

    public double getMean() {
        return mean;
    }

    public double getMedian() {
        return median;
    }
}
