//Tydzień 5, Wzorzec Interpreter - wyrażenie równości
//Implementuje terminal expression dla operacji sprawdzania równości wartości
//Porównuje wartość zmiennej z kontekstu z oczekiwaną wartością
package com.example.monitoringSystem.lab4Patterns.interpreter.interpreter1;

import java.util.ArrayList;
import java.util.List;

public class EqualToExpression implements AbstractExpression {    private final String name;
    private final double value;

    public EqualToExpression(String name, double value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public List<Double> interpret(Context context) {
        List<Double> result = new ArrayList<>(context.getContext(name));
        result.removeIf(val -> val != value);
        return result;
    }
}
//Koniec, Tydzień 5, Wzorzec Interpreter - wyrażenie równości
