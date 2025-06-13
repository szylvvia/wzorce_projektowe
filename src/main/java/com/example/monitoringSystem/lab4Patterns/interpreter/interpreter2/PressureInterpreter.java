//Tydzień 5, Wzorzec Interpreter - interpreter anomalii ciśnienia
//Terminal expression walidujący pomiary ciśnienia atmosferycznego
//Sprawdza czy ciśnienie mieści się w bezpiecznych granicach pomiarowych
package com.example.monitoringSystem.lab4Patterns.interpreter.interpreter2;

import java.util.List;

//Tydzień 5, Interpreter Pattern, Interpreter ciśnienia do interpretacji danych ciśnieniowych względem progu
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
//Koniec, Tydzień 5, Wzorzec Interpreter - interpreter ciśnienia