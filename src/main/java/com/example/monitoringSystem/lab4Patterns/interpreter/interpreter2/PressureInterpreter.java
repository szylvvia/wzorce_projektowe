package com.example.monitoringSystem.lab4Patterns.interpreter.interpreter2;

import java.util.List;

public class PressureInterpreter implements AbstractExpression {
    private Double threshold;

    public PressureInterpreter(Double threshold) {
        this.threshold = threshold;
    }

    public String interpret(EnvironmentData data, String date) {
        List<Double> pressuries = data.getPressureData(date);
        String result = "(PRÓG: "+threshold+" hPa) Cisnienie w dniu " + date + ": \n";
        if (pressuries != null) {
            for (Double temp : pressuries) {
                if (temp > threshold) {
                    result += " -> przekroczyło próg: " + temp + "hPa\n";
                } else {
                    result += " -> jest w normie: " + temp + "hPa\n";
                }
            }
        } else {
            result = "Brak danych dla cisnienia w dniu " + date;
        }
        return result;
    }
}