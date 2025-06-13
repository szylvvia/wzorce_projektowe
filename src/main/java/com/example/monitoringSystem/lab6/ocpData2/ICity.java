//Tydzień 7, Zasada OCP (Open/Closed Principle), interfejs miasta
//Definiuje kontrakt dla różnych typów miast w systemie monitoringu pogodowego
//Umożliwia dodawanie nowych implementacji miast bez modyfikacji kodu klienta
package com.example.monitoringSystem.lab6.ocpData2;

public interface ICity {
    void checkWeather();
}
//Koniec, Tydzień 7, Zasada OCP - interfejs miasta
