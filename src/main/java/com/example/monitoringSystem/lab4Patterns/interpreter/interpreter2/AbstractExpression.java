package com.example.monitoringSystem.lab4Patterns.interpreter.interpreter2;

import com.example.monitoringSystem.lab4Patterns.interpreter.interpreter1.Context;

import java.util.List;

//Tydzień 5, Interpreter Pattern, Interfejs abstrakcyjnego wyrażenia definiujący metodę interpretacji
public interface AbstractExpression {
    public abstract String interpret(EnvironmentData data, String date);
}
//Koniec, Tydzień 5, Interpreter Pattern
