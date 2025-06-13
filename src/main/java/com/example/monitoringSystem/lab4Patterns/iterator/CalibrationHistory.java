//Tydzień 5, Wzorzec Iterator - kolekcja historii kalibracji
//Agregat przechowujący dane kalibracji sensorów i udostępniający iterator
//Umożliwia sekwencyjny przegląd historycznych wartości kalibracji
package com.example.monitoringSystem.lab4Patterns.iterator;

public class CalibrationHistory {
    private double[] history = new double[50];
    private int index = 0;

    public void addCalibration(double value) {
        if (index < history.length) {
            history[index++] = value;
        }
    }

    public MyIterator<Double> createIterator() {
        return new CalibrationHistoryIterator(history, index);
    }
}
//Koniec, Tydzień 5, Wzorzec Iterator - historia kalibracji
