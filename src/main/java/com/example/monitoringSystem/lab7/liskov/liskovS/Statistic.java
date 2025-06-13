//Tydzień 8, Zasada LSP - klasa bazowa statystyk zgodna z Liskov Substitution Principle
//Definiuje kontrakt dla wszystkich typów statystyk środowiskowych
//Podklasy muszą zachować semantykę i oczekiwania klasy bazowej
package com.example.monitoringSystem.lab7.liskov.liskovS;

import java.util.List;

//Tydzień 8, Zasada LSP (Liskov Substitution Principle), klasa bazowa definiująca zachowanie dla statystyk pomiarów
public class Statistic {
    private List<Double> values;
    private double threshold;

    public List<Double> getValues() {
        return values;
    }

    public void setValues(List<Double> values) {
        this.values = values;
    }

    public double getThreshold() {
        return threshold;
    }

    public void setThreshold(double threshold) {
        this.threshold = threshold;
    }

    public Statistic(List<Double> values, double threshold) {
        this.values = values;
        this.threshold = threshold;
    }

    double getAverage() {
        double sum = 0;
        for (double value : values) {
            sum += value;
        }
        return sum / values.size();
    }

    double getMax() {
        double max = Double.MIN_VALUE;
        for (double value : values) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    boolean isCritical() {
        return getMax() > threshold;
    }    void printMessageAboutStatistic() {
        if (isCritical()) {
            System.out.println("[CRITICAL] Ktrytyczny poziom statystyki! Przekracza próg!");
        } else {
            System.out.println("[OK] Statystyka w normie.");
        }
    }
}
//Koniec, Tydzień 8, Zasada LSP - klasa bazowa statystyk
