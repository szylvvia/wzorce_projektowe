package com.example.monitoringSystem.lab6.ocpAbstract2;

//Tydzień 7, Zasada OCP (Open/Closed Principle), abstrakcyjna klasa bazowa dla miast
//Definiuje wspólny interfejs dla różnych typów miast w systemie monitoringu pogodowego
//Umożliwia rozszerzanie o nowe typy miast bez modyfikacji istniejącego kodu
abstract class ACity {
    abstract void updateWeather();
}
//Koniec, Tydzień 7, Zasada OCP - abstrakcyjna klasa miasta
