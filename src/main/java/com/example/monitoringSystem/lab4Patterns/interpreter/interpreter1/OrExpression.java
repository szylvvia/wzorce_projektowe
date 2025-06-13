package com.example.monitoringSystem.lab4Patterns.interpreter.interpreter1;

import java.util.ArrayList;
import java.util.List;

//Tydzień 5, Wzorzec Interpreter - wyrażenie logiczne OR
//Non-terminal expression łączące dwa wyrażenia operatorem alternatywy
//Zwraca true gdy przynajmniej jedno z podwyrażeń jest prawdziwe
public class OrExpression implements AbstractExpression {
    private final AbstractExpression left;
    private final AbstractExpression right;

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
//Koniec, Tydzień 5, Wzorzec Interpreter - wyrażenie OR
