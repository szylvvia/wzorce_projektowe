//Tydzień 7, Zasada OCP (Open/Closed Principle), interfejs strategii pomiarów
//Definiuje kontrakt dla różnych typów pomiarów w systemie monitoringu środowiskowego
//Umożliwia dodawanie nowych metod pomiarowych bez modyfikacji istniejącego kodu
package com.example.monitoringSystem.lab6.ocpAbstract;

public interface MeasurementStrategy {
    String performMeasurement();
}
//Koniec, Tydzień 7, Zasada OCP - interfejs strategii pomiarów

