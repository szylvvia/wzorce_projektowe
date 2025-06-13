//Tydzień 6, Wzorzec Strategy - kontekst dla strategii agregacji danych
//Klasa używająca różnych strategii do przetwarzania danych pomiarowych
//Pozwala na dynamiczną zmianę algorytmu agregacji w czasie wykonania
package com.example.monitoringSystem.lab5Patterns.strategy.DataAggregationStrategy;

public class DataAggregator {
    public double aggregateData(double[] data, DataAggregationStrategy strategy) {
        return strategy.aggregate(data);
    }
}
//Koniec, Tydzień 6, Wzorzec Strategy - kontekst
