package com.example.monitoringSystem.lab3Patterns.flyweight.flyweight3;

import java.util.Map;

//Tydzień 4, Flyweight Pattern, Interfejs flyweight dla alertów - definiuje wspólne operacje
public interface AbstractFlyAlert {
    Map<String, String> getAlertDetails();
}
//Koniec, Tydzień 4, Flyweight Pattern