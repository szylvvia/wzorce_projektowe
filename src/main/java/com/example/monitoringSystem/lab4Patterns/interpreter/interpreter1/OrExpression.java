package com.example.monitoringSystem.lab4Patterns.interpreter.interpreter1;

import java.util.ArrayList;
import java.util.List;

//Tydzień 5, Interpreter Pattern, Implementacja wyrażenia logicznego OR dla interpretacji reguł pomiarowych
public class OrExpression implements AbstractExpression {
    private AbstractExpression left;
    private AbstractExpression right;

    public OrExpression(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public List<Double> interpret(Context context) {
        List<Double> leftResult = new ArrayList<>(left.interpret(context));
        List<Double> rightResult = new ArrayList<>(right.interpret(context));
        leftResult.addAll(rightResult);
        return leftResult;
    }
}
//Koniec, Tydzień 5, Interpreter Pattern
