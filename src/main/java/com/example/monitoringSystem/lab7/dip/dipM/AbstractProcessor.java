package com.example.monitoringSystem.lab7.dip.dipM;

public abstract class AbstractProcessor implements IMeasurementProcessor {
    public abstract double process(double[] data);
}
