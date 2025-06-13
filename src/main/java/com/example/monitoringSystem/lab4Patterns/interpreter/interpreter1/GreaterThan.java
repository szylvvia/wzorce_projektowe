package com.example.monitoringSystem.lab4Patterns.interpreter.interpreter1;

import java.util.ArrayList;
import java.util.List;

//Tydzień 5, Wzorzec Interpreter - wyrażenie "większe niż"
//Terminal expression sprawdzające czy wartość jest większa od progu
//Używane do wykrywania przekroczeń limitów w pomiarach środowiskowych
public class GreaterThan implements AbstractExpression {
    private String key;
    private Double value;

    public GreaterThan(Double value, String key) {
        this.value = value;
        this.key = key;
    }

    public void setValue(Double value, String key) {
        this.value = value;
        this.key = key;
    }

    @Override
    public List<Double> interpret(Context context) {
        List<Double> result = new ArrayList<>();
        List<Double> contextValues = context.getContext(key);
        if (contextValues != null) {
            for (Double val : contextValues) {
                if (val > value) {
                    result.add(val);
                }
            }
        }        return result;
    }
}
//Koniec, Tydzień 5, Wzorzec Interpreter - wyrażenie większe
