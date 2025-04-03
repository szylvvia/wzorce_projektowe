package com.example.monitoringSystem.lab4Patterns.interpreter.interpreter1;

import java.util.List;

public class AndExpression implements AbstractExpression {
    private AbstractExpression left;
    private AbstractExpression right;

    public AndExpression(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public List<Double> interpret(Context context) {
        List<Double> leftResult = left.interpret(context);
        List<Double> rightResult = right.interpret(context);
        leftResult.retainAll(rightResult);
        return leftResult;
    }
}
