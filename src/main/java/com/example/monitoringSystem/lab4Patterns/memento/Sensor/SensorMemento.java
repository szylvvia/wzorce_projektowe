package com.example.monitoringSystem.lab4Patterns.memento.Sensor;

public class SensorMemento {
    private double calibrationValue;

    public void setCalibration(double value) {
        this.calibrationValue = value;
        System.out.println("Sensor calibration set to: " + value);
    }

    public SensorCalibrationMemento saveCalibration() {
        System.out.println("Saving sensor calibration: " + calibrationValue);
        return new SensorCalibrationMemento(calibrationValue);
    }

    public void restoreCalibration(SensorCalibrationMemento memento) {
        calibrationValue = memento.getCalibrationValue();
        System.out.println("Restored sensor calibration: " + calibrationValue);
    }
}
