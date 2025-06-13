package com.example.monitoringSystem.lab6.ocpAbstract2;

//Tydzień 7, Zasada OCP (Open/Closed Principle), abstrakcyjna klasa bazowa dla czujników
//Definiuje wspólny kontrakt dla różnych typów czujników w systemie monitoringu
//Umożliwia dodawanie nowych rodzajów czujników bez zmiany istniejącego kodu
abstract class ASensor {
    abstract void measure();
    abstract void calibrate();
}
//Koniec, Tydzień 7, Zasada OCP - abstrakcyjna klasa czujnika
