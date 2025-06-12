package com.example.monitoringSystem.lab5Patterns.state.StationState;

//Tydzień 6, State Pattern, Konkretny stan bezczynności stacji monitoringowej
public class IdleState implements StationState {
    @Override
    public void handleState() {
        System.out.println("Monitoring Station is idle. Awaiting activation.");
    }
}
//Koniec, Tydzień 6, State Pattern
