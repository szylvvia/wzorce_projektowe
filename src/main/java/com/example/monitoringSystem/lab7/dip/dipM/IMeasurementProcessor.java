//Tydzień 8, Zasada DIP (Dependency Inversion Principle), interfejs procesora pomiarów
//Abstrakcja definiująca kontrakt dla przetwarzania danych pomiarowych zgodnie z DIP
//Moduły wysokopoziomowe zależą od tego interfejsu, nie od konkretnych implementacji
package com.example.monitoringSystem.lab7.dip.dipM;

public interface IMeasurementProcessor {
    double process(double[] data);
}
//Koniec, Tydzień 8, Zasada DIP - interfejs procesora