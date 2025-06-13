package com.example.monitoringSystem.lab6.ocpAbstract;

//Tydzień 7, Zasada OCP (Open/Closed Principle), interfejs dla ostrzeżeń środowiskowych
//Definiuje wspólny kontrakt dla wszystkich typów ostrzeżeń w systemie monitoringu
//Umożliwia dodawanie nowych rodzajów ostrzeżeń bez zmiany istniejącego kodu
public interface EnvironmentalWarning {
    void checkWarning();
}
//Koniec, Tydzień 7, Zasada OCP - interfejs ostrzeżeń

