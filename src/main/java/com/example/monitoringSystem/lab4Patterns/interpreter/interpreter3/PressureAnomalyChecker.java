package com.example.monitoringSystem.lab4Patterns.interpreter.interpreter3;

import com.example.monitoringSystem.lab4Patterns.interpreter.interpreter2.EnvironmentData;

import java.util.List;

public class PressureAnomalyChecker implements AbstractExpression {
    private double threshold;

    public PressureAnomalyChecker(double threshold) {
        this.threshold = threshold;
    }

    @Override
    public boolean interpret(EnvironmentData data, String date) {
        List<Double> pressure = data.getPressureData(date);

        if (pressure.isEmpty()) {
            return false;
        }
        double avg = pressure.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
        return pressure.stream().anyMatch(temp -> Math.abs(temp - avg) > threshold);
    }

}
