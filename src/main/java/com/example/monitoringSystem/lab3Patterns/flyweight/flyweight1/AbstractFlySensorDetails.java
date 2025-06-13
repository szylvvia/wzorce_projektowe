package com.example.monitoringSystem.lab3Patterns.flyweight.flyweight1;

import java.util.Map;

//Tydzień 4, Flyweight Pattern, Interfejs flyweight dla szczegółów czujników - dzieli wspólne dane między obiektami
public interface AbstractFlySensorDetails {
    Map<String, String> getSensorDetails();
}
//Koniec, Tydzień 4, Flyweight Pattern
