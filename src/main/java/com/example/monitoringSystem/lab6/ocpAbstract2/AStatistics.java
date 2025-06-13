package com.example.monitoringSystem.lab6.ocpAbstract2;

//Tydzień 7, Zasada OCP (Open/Closed Principle), abstrakcyjna klasa bazowa dla statystyk
//Definiuje wspólny interfejs dla różnych typów analiz statystycznych w systemie
//Podstawa dla rozszerzalnego systemu obliczeń i raportowania statystycznego
abstract class AStatistics {
    abstract void calculateStatistics();
    abstract void generateReport();
}
//Koniec, Tydzień 7, Zasada OCP - abstrakcyjna klasa statystyk
