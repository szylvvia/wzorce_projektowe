package com.example.monitoringSystem.lab4Patterns.interpreter.interpreter1;

import java.util.List;

public interface AbstractExpression {
    List<Double> interpret(Context context);
}
