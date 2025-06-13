//Tydzień 6, Wzorzec Strategy - strategia agregacji mediany
//Konkretna strategia obliczająca medianę z zestawu danych pomiarowych
//Implementuje algorytm sortowania i znajdowania wartości środkowej
package com.example.monitoringSystem.lab5Patterns.strategy.DataAggregationStrategy;

import java.util.Arrays;

public class MedianAggregationStrategy implements DataAggregationStrategy {
    @Override
    public double aggregate(double[] data) {
        if (data.length == 0) return 0;
        double[] copy = Arrays.copyOf(data, data.length);
        Arrays.sort(copy);
        int mid = copy.length / 2;
        return (copy.length % 2 == 0) ? (copy[mid - 1] + copy[mid]) / 2 : copy[mid];
    }
}

//Koniec, Tydzień 6, Wzorzec Strategy - strategia mediany
