//Tydzień 5, Wzorzec Interpreter - wyrażenie OR dla anomalii
//Non-terminal expression łączące reguły wykrywania anomalii alternatywą
//Pozwala na elastyczne łączenie różnych warunków alarmowych
package com.example.monitoringSystem.lab4Patterns.interpreter.interpreter2;

//Tydzień 5, Interpreter Pattern, Kompozytowy interpreter do sprawdzania anomalii z logiką OR
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
//Koniec, Tydzień 5, Wzorzec Interpreter - wyrażenie OR anomalii
