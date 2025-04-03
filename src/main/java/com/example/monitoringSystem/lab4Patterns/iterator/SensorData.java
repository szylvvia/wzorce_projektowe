package com.example.monitoringSystem.lab4Patterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SensorData implements Iterable<Double> {
    private List<Double> measurements = new ArrayList<>();

    public void addMeasurement(double value) {
        measurements.add(value);
    }

    @Override
    public Iterator<Double> iterator() {
        return measurements.iterator();
    }
}
