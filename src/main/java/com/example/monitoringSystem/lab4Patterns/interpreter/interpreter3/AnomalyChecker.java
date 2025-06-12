package com.example.monitoringSystem.lab4Patterns.interpreter.interpreter3;

import com.example.monitoringSystem.lab4Patterns.interpreter.interpreter2.EnvironmentData;

//Tydzień 5, Interpreter Pattern, Kompozytowy checker do sprawdzania anomalii łączący inne checkery
public class AnomalyChecker implements AbstractExpression {
    private AbstractExpression exp1;
    private AbstractExpression exp2;

    public AnomalyChecker(AbstractExpression exp1, AbstractExpression exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    @Override
    public boolean interpret(EnvironmentData data, String date) {
        boolean result1 = exp1.interpret(data, date);
        boolean result2 = exp2.interpret(data, date);

        return result1 || result2;
    }


}
//Koniec, Tydzień 5, Interpreter Pattern
