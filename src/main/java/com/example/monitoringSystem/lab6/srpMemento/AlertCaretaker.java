//Tydzień 7, Zasada SRP + Wzorzec Memento, opiekun historii alertów
//Single Responsibility Principle - odpowiedzialny tylko za zarządzanie historią stanów
//Wzorzec Memento - przechowuje i przywraca poprzednie stany alertów systemu
package com.example.monitoringSystem.lab6.srpMemento;

import java.util.Stack;

public class AlertCaretaker {
    //przechowywanie i przywracanie historii
    private final Stack<AlertMemento> alertHistory = new Stack<>();

    public void save(AlertMemento memento) {
        alertHistory.push(memento);
    }

    public AlertMemento restore() {
        return alertHistory.isEmpty() ? null : alertHistory.pop();
    }
}
//Koniec, Tydzień 7, Zasada SRP + Wzorzec Memento - opiekun alertów
