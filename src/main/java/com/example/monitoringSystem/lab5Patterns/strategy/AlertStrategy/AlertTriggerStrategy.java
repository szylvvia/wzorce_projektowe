//Tydzień 6, Wzorzec Strategy - interfejs strategii wyzwalania alertów
//Definiuje kontrakt dla różnych algorytmów określania kiedy wyzwolić alert
//Pozwala na wymienną implementację logiki alertów (próg, statystyki, tempo zmian)
package com.example.monitoringSystem.lab5Patterns.strategy.AlertStrategy;

public interface AlertTriggerStrategy {
    boolean shouldTrigger(double sensorValue, double threshold);
}
//Koniec, Tydzień 6, Wzorzec Strategy - interfejs alertów
