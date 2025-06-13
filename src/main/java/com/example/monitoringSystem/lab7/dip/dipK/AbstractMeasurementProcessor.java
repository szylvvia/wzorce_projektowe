//Tydzień 8, Zasada DIP (Dependency Inversion Principle), abstrakcyjny procesor pomiarów
//Implementuje bazową funkcjonalność przetwarzania zgodnie z zasadą DIP
//Pozwala na tworzenie konkretnych procesorów bez modyfikacji kodu wysokopoziomowego
package com.example.monitoringSystem.lab7.dip.dipK;

public abstract class AbstractMeasurementProcessor implements MeasurementProcessor {
    public abstract double process(double[] values);
}
//Koniec, Tydzień 8, Zasada DIP - abstrakcyjny procesor pomiarów

