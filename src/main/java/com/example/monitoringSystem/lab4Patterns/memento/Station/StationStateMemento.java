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
