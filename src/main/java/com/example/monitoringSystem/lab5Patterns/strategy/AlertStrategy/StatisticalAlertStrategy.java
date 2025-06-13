//Tydzień 6, Wzorzec Strategy - strategia alertu statystycznego
//Konkretna strategia wykorzystująca analizę statystyczną do oceny alertów
//Porównuje wartości z progami używając odchylenia standardowego
package com.example.monitoringSystem.lab5Patterns.strategy.AlertStrategy;

public class StatisticalAlertStrategy implements AlertTriggerStrategy {
    @Override
    public boolean shouldTrigger(double sensorValue, double threshold) {
        int sensorTriggerValue = 10;
        return Math.abs(sensorValue - threshold) > sensorTriggerValue;
    }
}

//Koniec, Tydzień 6, Wzorzec Strategy - strategia statystyczna