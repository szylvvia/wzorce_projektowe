package com.example.monitoringSystem.lab5Patterns.state.SensorState;

//Tydzień 6, State Pattern, Konkretny stan awarii czujnika
public class FaultState implements SensorState {
    @Override
    public void reportStatus() {
        System.out.println("Sensor fault detected!");
    }
}
//Koniec, Tydzień 6, State Pattern
