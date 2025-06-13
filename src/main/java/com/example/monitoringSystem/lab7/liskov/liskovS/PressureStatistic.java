//Tydzień 8, Zasada LSP - statystyki ciśnienia zgodne z LSP
//Rozszerza klasę Statistic zachowując jej kontrakt
//Implementuje specjalistyczne funkcje dla analiz ciśnienia atmosferycznego
package com.example.monitoringSystem.lab7.liskov.liskovS;

import java.util.List;

//Tydzień 8, Zasada LSP (Liskov Substitution Principle), klasa pochodna z rozszerzoną logiką sprawdzania krytyczności ciśnienia
public class PressureStatistic extends Statistic {

    public PressureStatistic(List<Double> values, double threshold) {
        super(values, threshold);
    }

    @Override
    boolean isCritical() {
        return getMax() > getThreshold() || getAverage() > getThreshold();
    }

    @Override
    void printMessageAboutStatistic() {        if (isCritical()) {
            System.out.println("[CRITICAL PRESSURE] Krytyczny poziom ciśnienia! Ciśnienie przekracza próg!");
        } else {
            System.out.println("[OK PRESSURE] Ciśnienie w normie.");
        }
    }
}
//Koniec, Tydzień 8, Zasada LSP - statystyki ciśnienia
