package com.example.monitoringSystem.lab4Patterns.interpreter.interpreter3;

import com.example.monitoringSystem.lab4Patterns.interpreter.interpreter2.EnvironmentData;

import java.util.List;

public class HumidityAnomalyChecker implements AbstractExpression {
    private double threshold;

    public HumidityAnomalyChecker(double threshold) {
        this.threshold = threshold;
    }

    @Override
    public boolean interpret(EnvironmentData data, String date) {
        List<Double> humidityData = data.getHumidityData(date);

        if (humidityData.isEmpty()) {
            return false;
        }
        double otherDataElse = 0.0;
        double avg = humidityData.stream().mapToDouble(Double::doubleValue).average().orElse(otherDataElse);
        return humidityData.stream().anyMatch(temp -> Math.abs(temp - avg) > threshold);

    }

}
