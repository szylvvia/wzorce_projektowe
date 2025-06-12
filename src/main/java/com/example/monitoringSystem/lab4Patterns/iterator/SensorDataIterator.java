package com.example.monitoringSystem.lab4Patterns.iterator;

//Tydzień 5, Wzorzec Iterator 1
//Iterator pattern dla danych z sensorów - zapewnia sekwencyjny dostęp do elementów kolekcji
//Umożliwia przeglądanie kolekcji bez ujawniania jej wewnętrznej struktury
public class SensorDataIterator implements MyIterator<Double> {
    private final double[] data;
    private final int size;
    private int position = 0;

    public SensorDataIterator(double[] data, int size) {
        this.data = data;
        this.size = size;
    }

    @Override
    public boolean hasNext() {
        return position < size;
    }    @Override
    public Double next() {
        return data[position++];
    }
}
//Koniec, Tydzień 5, Wzorzec Iterator 1
