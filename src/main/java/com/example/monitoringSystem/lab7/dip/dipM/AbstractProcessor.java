//Tydzień 8, Zasada DIP (Dependency Inversion Principle), abstrakcyjny procesor implementujący interfejs
//Bazowa implementacja procesora pomiarów zgodnie z zasadą DIP
//Umożliwia tworzenie specjalizowanych procesorów bez modyfikacji kodu wysokopoziomowego
package com.example.monitoringSystem.lab7.dip.dipM;

public abstract class AbstractProcessor implements IMeasurementProcessor {
    public abstract double process(double[] data);
}
//Koniec, Tydzień 8, Zasada DIP - abstrakcyjny procesor
