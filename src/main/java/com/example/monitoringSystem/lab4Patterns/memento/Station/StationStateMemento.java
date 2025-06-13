//Tydzień 5, Wzorzec Memento - memento stanu stacji pomiarowej
//Przechowuje snapshot konfiguracji i parametrów stacji monitoringu
//Umożliwia przywracanie poprzednich ustawień stacji w przypadku błędów
package com.example.monitoringSystem.lab4Patterns.memento.Station;

public class StationStateMemento {
    private final String state;

    public StationStateMemento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
//Koniec, Tydzień 5, Wzorzec Memento - memento stacji
