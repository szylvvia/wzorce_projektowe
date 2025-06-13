package com.example.monitoringSystem.lab5Patterns.state.AlertState;

//Tydzień 6, State Pattern, Konkretny stan krytycznego alertu
public class CriticalAlertState implements AlertState {
    @Override
    public void alert() {
        System.out.println("Alert Level: Critical! Immediate action required!");
    }
}
//Koniec, Tydzień 6, State Pattern