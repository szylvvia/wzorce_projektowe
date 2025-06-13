package com.example.monitoringSystem.lab6.ocpAbstract;

//Tydzień 7, Zasada OCP (Open/Closed Principle), konkretna implementacja ostrzeżenia o poziomie CO2
//Klasa zamknięta na modyfikacje ale otwarta na rozszerzenia przez implementację interfejsu
//Demonstruje jak dodawać nowe typy ostrzeżeń bez modyfikacji istniejącego kodu
public class CO2Warning implements EnvironmentalWarning {
    @Override
    public void checkWarning() {
        System.out.println("Checking CO2 level warning...");
    }
}
//Koniec, Tydzień 7, Zasada OCP - ostrzeżenie CO2
