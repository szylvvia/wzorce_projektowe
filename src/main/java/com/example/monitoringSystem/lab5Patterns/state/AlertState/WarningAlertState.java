package com.example.monitoringSystem.lab5Patterns.state.AlertState;

//Tydzień 6, State Pattern, Konkretny stan ostrzegawczego alertu
public class WarningAlertState implements AlertState {
    @Override
    public void alert() {
        System.out.println("Alert Level: Warning. Monitor the situation.");
    }
}
//Koniec, Tydzień 6, State Pattern
