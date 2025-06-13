package com.example.monitoringSystem.lab4Patterns.interpreter.interpreter3;

//Tydzień 5, Wzorzec Interpreter - checker anomalii ciśnienia
//Analizuje pomiary ciśnienia atmosferycznego pod kątem nieprawidłowości
//Wykrywa gwałtowne zmiany ciśnienia mogące wskazywać na problemy systemowe

import com.example.monitoringSystem.lab4Patterns.interpreter.interpreter2.EnvironmentData;

import java.util.List;

//Tydzień 5, Interpreter Pattern, Checker do wykrywania anomalii ciśnieniowych względem progu
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
        double otherDataElse = 0.0;
        double avg = pressure.stream().mapToDouble(Double::doubleValue).average().orElse(otherDataElse);
        return pressure.stream().anyMatch(temp -> Math.abs(temp - avg) > threshold);
    }

}
//Koniec, Tydzień 5, Wzorzec Interpreter - checker ciśnienia
