package com.example.monitoringSystem.lab4Patterns.memento.Station;

public class MeasuringStationMemento {
    private String state;

    public void setState(String state) {
        this.state = state;
        System.out.println("Current station state: " + state);
    }

    public StationStateMemento saveState() {
        System.out.println("Saving station state: " + state);
        return new StationStateMemento(state);
    }

    public void restoreState(StationStateMemento memento) {
        state = memento.getState();
        System.out.println("Restored station state: " + state);
    }
}