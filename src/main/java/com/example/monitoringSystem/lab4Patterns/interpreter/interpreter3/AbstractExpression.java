package com.example.monitoringSystem.lab4Patterns.interpreter.interpreter3;

import com.example.monitoringSystem.lab4Patterns.interpreter.interpreter2.EnvironmentData;

public interface AbstractExpression {
    boolean interpret(EnvironmentData data, String date);
}
