package com.example.monitoringSystem.lab4Patterns.iterator;

import java.util.LinkedList;
import java.util.Iterator;

public class CalibrationHistory {
    private LinkedList<Double> history = new LinkedList<>();

    public void addCalibration(double value) {
        history.add(value);
    }

    public Iterator<Double> getIterator() {
        return history.iterator();
    }
}
