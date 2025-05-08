package com.example.monitoringSystem.lab7.dip.dipK;

public class MeasurementAnalyzer {
    private final MeasurementProcessor processor;

    public MeasurementAnalyzer(MeasurementProcessor processor) {
        this.processor = processor;
    }

    public void analyze(double[] data) {
        double result = processor.process(data);
        System.out.println("Processed average: " + result);
    }
}

