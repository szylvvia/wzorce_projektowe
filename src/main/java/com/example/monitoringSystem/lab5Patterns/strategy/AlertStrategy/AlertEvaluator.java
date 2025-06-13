//Tydzień 6, Wzorzec Strategy - ewaluator alertów systemowych
//Kontekst używający różnych strategii oceny warunków alarmowych
//Umożliwia dynamiczną zmianę algorytmu oceny bez modyfikacji kodu klienta
package com.example.monitoringSystem.lab5Patterns.strategy.AlertStrategy;

public class AlertEvaluator {
    public boolean evaluate(double sensorValue, double threshold, AlertTriggerStrategy strategy) {
        return strategy.shouldTrigger(sensorValue, threshold);
    }
}

//Koniec, Tydzień 6, Wzorzec Strategy - ewaluator alertów
