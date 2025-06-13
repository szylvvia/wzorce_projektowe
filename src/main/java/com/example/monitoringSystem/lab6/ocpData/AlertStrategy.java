//Tydzień 7, Zasada OCP (Open/Closed Principle), interfejs strategii alertów
//Definiuje kontrakt dla różnych typów alertów w systemie monitoringu
//Umożliwia dodawanie nowych implementacji alertów bez modyfikacji kodu klienta
package com.example.monitoringSystem.lab6.ocpData;

public interface AlertStrategy {
    void send(String message);
}
//Koniec, Tydzień 7, Zasada OCP - interfejs strategii alertów
