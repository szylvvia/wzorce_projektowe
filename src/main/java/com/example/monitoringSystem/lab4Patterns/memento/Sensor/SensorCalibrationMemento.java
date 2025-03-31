package com.example.monitoringSystem.lab4Patterns.memento.Sensor;

public class SensorCalibrationMemento {
    private final double calibrationValue;

    public SensorCalibrationMemento(double calibrationValue) {
        this.calibrationValue = calibrationValue;
    }

    public double getCalibrationValue() {
        return calibrationValue;
    }
}
