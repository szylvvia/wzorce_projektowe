package com.example.monitoringSystem.lab5Patterns.state.SensorState;

//Tydzień 6, State Pattern, Kontekst czujnika zarządzający aktualnym stanem
public class SensorContext {
    private SensorState currentState;

    public void setState(SensorState state) {
        this.currentState = state;
    }

    public void displayStatus() {
        if (currentState != null) {
            currentState.reportStatus();
        } else {
            System.out.println("Sensor state not set.");
        }
    }
}
//Koniec, Tydzień 6, State Pattern
