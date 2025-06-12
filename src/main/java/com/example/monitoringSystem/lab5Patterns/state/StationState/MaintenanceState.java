package com.example.monitoringSystem.lab5Patterns.state.StationState;

//Tydzień 6, State Pattern, Konkretny stan konserwacji stacji monitoringowej
public class MaintenanceState implements StationState {
    @Override
    public void handleState() {
        System.out.println("Monitoring Station is under maintenance.");
    }
}
//Koniec, Tydzień 6, State Pattern
