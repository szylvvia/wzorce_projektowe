//Tydzień 5, Wzorzec Interpreter - abstrakcyjne wyrażenie finalne
//Definiuje kontrakt dla wszystkich wyrażeń w systemie interpretacji
//Podstawa dla budowy gramatyki języka reguł anomalii środowiskowych
package com.example.monitoringSystem.lab4Patterns.interpreter.interpreter3;

import com.example.monitoringSystem.lab4Patterns.interpreter.interpreter2.EnvironmentData;

//Tydzień 5, Interpreter Pattern, Interfejs abstrakcyjnego wyrażenia zwracający wartość boolean
public interface AbstractExpression {
    boolean interpret(EnvironmentData data, String date);
}
//Koniec, Tydzień 5, Wzorzec Interpreter - abstrakcyjne wyrażenie finalne
