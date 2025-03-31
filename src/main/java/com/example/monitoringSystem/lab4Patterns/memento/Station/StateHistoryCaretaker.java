package com.example.monitoringSystem.lab4Patterns.memento.Station;

import java.util.Stack;

public class StateHistoryCaretaker {
    private Stack<StationStateMemento> history = new Stack<>();

    public void saveMemento(StationStateMemento memento) {
        history.push(memento);
    }

    public StationStateMemento restoreMemento() {
        return history.isEmpty() ? null : history.pop();
    }
}
