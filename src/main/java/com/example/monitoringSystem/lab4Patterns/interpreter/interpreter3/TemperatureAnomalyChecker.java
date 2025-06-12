package com.example.monitoringSystem.lab4Patterns.interpreter.interpreter3;

import com.example.monitoringSystem.lab4Patterns.interpreter.interpreter2.EnvironmentData;

import java.util.List;

//Tydzień 5, Interpreter Pattern, Checker do wykrywania anomalii temperaturowych względem progu
public class TemperatureAnomalyChecker implements AbstractExpression {
    private double threshold;

    public TemperatureAnomalyChecker(double threshold) {
        this.threshold = threshold;
    }

    @Override
    public boolean interpret(EnvironmentData data, String date) {
        List<Double> temperatureData = data.getTemperatureData(date);

        if (temperatureData.isEmpty()) {
            return false;
        }
        double otherDataElse = 0.0;
        double avg = temperatureData.stream().mapToDouble(Double::doubleValue).average().orElse(otherDataElse);
        return temperatureData.stream().anyMatch(temp -> Math.abs(temp - avg) > threshold);
    }

}
//Koniec, Tydzień 5, Interpreter Pattern
