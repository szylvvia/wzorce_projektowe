package com.example.monitoringSystem.lab4Patterns.interpreter.interpreter2;

import java.util.List;

//Tydzień 5, Interpreter Pattern, Interpreter wilgotności do interpretacji danych wilgotności względem progu
public class HumidityInterpreter implements AbstractExpression {
    private Double threshold;

    public HumidityInterpreter(Double threshold) {
        this.threshold = threshold;
    }

    public String interpret(EnvironmentData data, String date) {
        List<Double> humidities = data.getHumidityData(date);
        String result = "(PRÓG: "+threshold+" %) Wilgotnosc w dniu " + date + ": \n";
        if (humidities != null) {
            for (Double temp : humidities) {
                if (temp > threshold) {
                    result += " -> przekroczyła próg: " + temp + "%\n";
                } else {
                    result += " -> jest w normie: " + temp + "%\n";
                }
            }
        } else {
            result = "Brak danych dla wilgotności w dniu " + date;
        }
        return result;
    }
}
//Koniec, Tydzień 5, Interpreter Pattern
