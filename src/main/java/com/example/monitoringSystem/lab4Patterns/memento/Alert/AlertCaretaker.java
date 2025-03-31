package com.example.monitoringSystem.lab4Patterns.memento.Alert;

import java.util.Stack;

public class AlertCaretaker {
    private Stack<AlertMemento> alertHistory = new Stack<>();

    public void saveAlert(AlertMemento memento) {
        alertHistory.push(memento);
    }

    public AlertMemento restoreAlert() {
        return alertHistory.isEmpty() ? null : alertHistory.pop();
    }
}
