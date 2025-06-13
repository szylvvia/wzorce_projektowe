//Tydzień 5, Wzorzec Iterator - konkretny iterator dla historii kalibracji
//Implementuje sekwencyjny dostęp do wartości kalibracji sensorów
//Enkapsuluje logikę przeglądania danych kalibracji bez ujawniania implementacji
package com.example.monitoringSystem.lab4Patterns.iterator;

public class CalibrationHistoryIterator implements MyIterator<Double> {
    private final double[] history;
    private final int size;
    private int current = 0;

    public CalibrationHistoryIterator(double[] history, int size) {
        this.history = history;
        this.size = size;
    }

    @Override
    public boolean hasNext() {
        return current < size;
    }

    @Override
    public Double next() {
        return history[current++];
    }
}
//Koniec, Tydzień 5, Wzorzec Iterator - iterator kalibracji
