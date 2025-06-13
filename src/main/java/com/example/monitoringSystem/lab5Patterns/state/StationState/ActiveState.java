package com.example.monitoringSystem.lab5Patterns.state.StationState;

//Tydzień 6, State Pattern, Konkretny stan aktywności stacji monitoringowej
public class ActiveState implements StationState {
    @Override
    public void handleState() {
        System.out.println("Monitoring Station is active and monitoring environmental parameters.");
    }
}
//Koniec, Tydzień 6, State Pattern
