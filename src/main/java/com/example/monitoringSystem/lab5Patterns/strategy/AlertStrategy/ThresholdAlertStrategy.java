//Tydzień 6, Wzorzec Strategy - konkretna strategia alertów progowych
//Implementuje prostą logikę wyzwalania alertu gdy wartość przekracza próg
//Podstawowa strategia alertów używana w monitoringu środowiskowym
package com.example.monitoringSystem.lab5Patterns.strategy.AlertStrategy;

public class ThresholdAlertStrategy implements AlertTriggerStrategy {
    @Override
    public boolean shouldTrigger(double sensorValue, double threshold) {
        return sensorValue > threshold;
    }
}
//Koniec, Tydzień 6, Wzorzec Strategy - strategia progowa