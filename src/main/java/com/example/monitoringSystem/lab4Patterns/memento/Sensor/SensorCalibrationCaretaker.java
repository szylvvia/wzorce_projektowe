package com.example.monitoringSystem.lab4Patterns.memento.Sensor;

import java.util.Stack;

public class SensorCalibrationCaretaker {
    private Stack<SensorCalibrationMemento> calibrationHistory = new Stack<>();

    public void saveCalibration(SensorCalibrationMemento memento) {
        calibrationHistory.push(memento);
    }

    public SensorCalibrationMemento restoreCalibration() {
        return calibrationHistory.isEmpty() ? null : calibrationHistory.pop();
    }
}
