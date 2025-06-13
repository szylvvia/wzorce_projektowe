package com.example.monitoringSystem.lab5Patterns.state.AlertState;

//Tydzień 6, State Pattern, Konkretny stan normalnego alertu
public class NormalAlertState implements AlertState {
    @Override
    public void alert() {
        System.out.println("Alert Level: Normal. No action required.");
    }
}
//Koniec, Tydzień 6, State Pattern