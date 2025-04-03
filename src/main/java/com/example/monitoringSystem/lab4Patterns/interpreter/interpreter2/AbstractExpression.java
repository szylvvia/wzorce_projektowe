package com.example.monitoringSystem.lab4Patterns.interpreter.interpreter2;

import com.example.monitoringSystem.lab4Patterns.interpreter.interpreter1.Context;

import java.util.List;

public interface AbstractExpression {
    public abstract String interpret(EnvironmentData data, String date);
}
