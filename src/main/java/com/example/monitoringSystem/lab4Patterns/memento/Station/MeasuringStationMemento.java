//Tydzień 5, Wzorzec Memento - originator stacji pomiarowej
//Tworzy i przywraca memento dla stacji monitoringu środowiska
//Enkapsuluje wewnętrzny stan stacji i umożliwia jego serializację
package com.example.monitoringSystem.lab4Patterns.memento.Station;

//Tydzień 5, Wzorzec Memento 1
//Memento pattern dla stacji pomiarowej - zachowuje i przywraca stany obiektu
//Umożliwia przywrócenie poprzedniego stanu bez naruszania enkapsulacji
public class MeasuringStationMemento {
    private String state;

    public void setState(String state) {
        this.state = state;
        System.out.println("Current station state: " + state);
    }

    public StationStateMemento saveState() {
        System.out.println("Saving station state: " + state);
        return new StationStateMemento(state);
    }    public void restoreState(StationStateMemento memento) {
        state = memento.getState();
        System.out.println("Restored station state: " + state);
    }
}
//Koniec, Tydzień 5, Wzorzec Memento - originator stacji