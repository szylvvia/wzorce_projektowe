package com.example.monitoringSystem.lab4Patterns.interpreter.interpreter1;

import java.util.List;

//Tydzień 5, Wzorzec Interpreter, abstrakcyjne wyrażenie definiujące operację interpretacji
public interface AbstractExpression {
    List<Double> interpret(Context context);
}
//Koniec, Tydzień 5, Wzorzec Interpreter
