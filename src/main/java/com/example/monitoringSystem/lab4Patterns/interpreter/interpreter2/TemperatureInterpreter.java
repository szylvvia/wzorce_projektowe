package com.example.monitoringSystem.lab4Patterns.interpreter.interpreter2;

import java.util.List;

public class TemperatureInterpreter implements AbstractExpression {
    private double threshold;

    public TemperatureInterpreter(double threshold) {
        this.threshold = threshold;
    }

    public double getThreshold() {
        return threshold;
    }

    @Override
    public String interpret(EnvironmentData data, String date) {
        List<Double> temperatures = data.getTemperatureData(date);
        String result = "(PRÓG: "+getThreshold()+"°C) "+"Temperatura w dniu" + date + ": \n";
        if (temperatures != null) {
            for (Double temp : temperatures) {
                if (temp > threshold) {
                    result += " -> przekroczyła próg: " + temp + "°C\n";
                } else {
                    result += " -> jest w normie: " + temp + "°C\n";
                }
            }
        } else {
            result = "Brak danych dla temperatury w dniu " + date;
        }
        return result;
    }
}
