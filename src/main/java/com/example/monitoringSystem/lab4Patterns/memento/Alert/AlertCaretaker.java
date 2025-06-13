package com.example.monitoringSystem.lab4Patterns.memento.Alert;

import java.util.Stack;

//Tydzień 5, Wzorzec Memento - opiekun historii alertów
//Zarządza historią stanów systemu alertów używając stosu
//Implementuje funkcjonalność cofania i przywracania stanów alertów
public class AlertCaretaker {
    private Stack<AlertMemento> alertHistory = new Stack<>();

    //Zapisuje dany stan alertu (memento) do historii
    public void saveAlert(AlertMemento memento) {
        alertHistory.push(memento);
    }

    //Przywraca ostatni zapisany stan alertu z historii
    public AlertMemento restoreAlert() {
        return alertHistory.isEmpty() ? null : alertHistory.pop();
    }
}
//Koniec, Tydzień 5, Wzorzec Memento - opiekun alertów
