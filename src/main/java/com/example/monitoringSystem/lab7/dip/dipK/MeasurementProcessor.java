//Tydzień 8, Zasada DIP (Dependency Inversion Principle), interfejs procesora pomiarów
//Abstrakcja definiująca kontrakt dla przetwarzania pomiarów zgodnie z zasadą DIP
//Moduły wysokopoziomowe zależą od tego interfejsu, nie od konkretnych implementacji
package com.example.monitoringSystem.lab7.dip.dipK;

public interface MeasurementProcessor {
    double process(double[] values);
}
//Koniec, Tydzień 8, Zasada DIP - interfejs procesora

