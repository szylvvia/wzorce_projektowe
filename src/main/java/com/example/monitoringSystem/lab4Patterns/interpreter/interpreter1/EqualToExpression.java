package com.example.monitoringSystem.lab4Patterns.interpreter.interpreter1;

import java.util.ArrayList;
import java.util.List;

public class EqualToExpression implements AbstractExpression {
    private String name;
    private double value;

    public EqualToExpression(String name, double value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public List<Double> interpret(Context context) {
        List<Double> result = new ArrayList<>(context.getContext(name));
        result.removeIf(val -> val != value);
        return result;
    }
}
