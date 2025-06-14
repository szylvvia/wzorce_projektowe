//Tydzień 5, Wzorzec Interpreter - checker anomalii wilgotności
//Sprawdza czy poziom wilgotności mieści się w bezpiecznych granicach
//Implementuje logikę wykrywania anomalii wilgotnościowych w środowisku
package com.example.monitoringSystem.lab4Patterns.interpreter.interpreter3;

import com.example.monitoringSystem.lab4Patterns.interpreter.interpreter2.EnvironmentData;

import java.util.List;

//Tydzień 5, Interpreter Pattern, Checker do wykrywania anomalii wilgotności względem progu
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
//Koniec, Tydzień 5, Wzorzec Interpreter - checker wilgotności
