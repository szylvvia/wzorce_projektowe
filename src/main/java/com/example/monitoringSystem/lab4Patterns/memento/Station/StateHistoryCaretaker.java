package com.example.monitoringSystem.lab4Patterns.memento.Station;

//Tydzień 5, Wzorzec Memento - opiekun historii stacji pomiarowych

import java.util.Stack;

//Caretaker zarządzający historią stanów stacji monitoringu środowiska
//Implementuje mechanizm undo/redo dla konfiguracji stacji pomiarowych
public class StateHistoryCaretaker {
    private Stack<StationStateMemento> history = new Stack<>();

    public void saveMemento(StationStateMemento memento) {
        history.push(memento);
    }

    public StationStateMemento restoreMemento() {
        return history.isEmpty() ? null : history.pop();
    }
}
//Koniec, Tydzień 5, Wzorzec Memento - opiekun stacji
