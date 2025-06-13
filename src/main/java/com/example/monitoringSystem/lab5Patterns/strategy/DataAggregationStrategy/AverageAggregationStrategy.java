//Tydzień 6, Wzorzec Strategy - konkretna strategia obliczania średniej
//Implementuje algorytm obliczania średniej arytmetycznej z danych pomiarowych
//Jedna z wymiennych strategii agregacji dostępnych w systemie
package com.example.monitoringSystem.lab5Patterns.strategy.DataAggregationStrategy;

import java.util.Arrays;

public class AverageAggregationStrategy implements DataAggregationStrategy {
    @Override
    public double aggregate(double[] data) {
        double sum = 0;
        for (double d : data) {
            sum += d;
        }
        return data.length > 0 ? sum / data.length : 0;
    }
}
//Koniec, Tydzień 6, Wzorzec Strategy - strategia średniej
