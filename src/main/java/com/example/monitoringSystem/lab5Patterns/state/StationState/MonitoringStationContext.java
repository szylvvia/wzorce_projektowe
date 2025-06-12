package com.example.monitoringSystem.lab5Patterns.state.StationState;

//Tydzień 6, State Pattern, Kontekst stacji monitoringowej zarządzający aktualnym stanem
public class MonitoringStationContext {
    private StationState currentState;

    public void setState(StationState state) {
        this.currentState = state;
    }

    public void reportState() {
        if (currentState != null) {
            currentState.handleState();
        } else {
            System.out.println("State not set.");
        }
    }
}
//Koniec, Tydzień 6, State Pattern
