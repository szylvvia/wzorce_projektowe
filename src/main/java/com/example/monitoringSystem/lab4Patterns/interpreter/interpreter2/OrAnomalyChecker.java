package com.example.monitoringSystem.lab4Patterns.interpreter.interpreter2;

public class OrAnomalyChecker implements AbstractExpression {
    AbstractExpression exp1;
    AbstractExpression exp2;
    AbstractExpression exp3;

    public OrAnomalyChecker(AbstractExpression exp1, AbstractExpression exp2, AbstractExpression exp3) {
        this.exp1 = exp1;
        this.exp2 = exp2;
        this.exp3 = exp3;
    }

    @Override
    public String interpret(EnvironmentData data, String date) {
        String result1 = exp1.interpret(data, date);
        String result2 = exp2.interpret(data, date);
        String result3 = exp3.interpret(data, date);

        if (result1.equals("przekroczyło") || result2.equals("przekroczyło") || result3.equals("przekroczyło")) {
            return "Wykryto minimum jedna anomalie";
        } else {
            return "Nie wykryto anomalii";
        }
    }
}
