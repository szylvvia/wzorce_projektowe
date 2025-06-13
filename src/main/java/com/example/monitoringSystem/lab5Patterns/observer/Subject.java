//Tydzień 6, Wzorzec Observer - interfejs podmiotu obserwowanego
//Definiuje operacje zarządzania obserwatorami i powiadamiania o zmianach
//Implementowany przez obiekty które chcą informować o swoich zmianach stanu
package com.example.monitoringSystem.lab5Patterns.observer;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
//Koniec, Tydzień 6, Wzorzec Observer - interfejs podmiotu
