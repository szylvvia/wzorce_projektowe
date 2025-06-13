//Tydzień 6, Wzorzec Strategy - konkretna strategia znajdowania maksimum
//Implementuje algorytm wyszukiwania największej wartości w zestawie danych
//Strategia przydatna do identyfikacji szczytowych wartości pomiarowych
package com.example.monitoringSystem.lab5Patterns.strategy.DataAggregationStrategy;

public class MaximumAggregationStrategy implements DataAggregationStrategy {
    @Override
    public double aggregate(double[] data) {
        double max = Double.NEGATIVE_INFINITY;
        for (double d : data) {
            if (d > max) {
                max = d;
            }
        }
        return max;
    }
}
//Koniec, Tydzień 6, Wzorzec Strategy - strategia maksimum
