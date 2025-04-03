package com.example.monitoringSystem.lab4Patterns.interpreter.interpreter1;

import java.util.ArrayList;
import java.util.List;

public class LessThan implements AbstractExpression {
    private String key;
    private Double value;

    public LessThan(Double value, String key) {
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
        List<Double> contextValues = new ArrayList<>(context.getContext(key));
        if (contextValues != null) {
            for (Double val : contextValues) {
                if (val < value) {
                    result.add(val);
                }
            }
        }
        return result;
    }
}
