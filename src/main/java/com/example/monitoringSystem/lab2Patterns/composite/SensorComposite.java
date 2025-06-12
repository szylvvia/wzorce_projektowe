package com.example.monitoringSystem.lab2Patterns.composite;

//Tydzień 3, Wzorzec Composite, interfejs określający wspólne operacje dla obiektów prostych i złożonych w hierarchii czujników
public interface SensorComposite {    String getDetails();
    void showMeasurement();
    void reset();
}
//Koniec, Tydzień 3, Wzorzec Composite
