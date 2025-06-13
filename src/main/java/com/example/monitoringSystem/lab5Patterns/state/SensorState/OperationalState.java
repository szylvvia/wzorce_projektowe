package com.example.monitoringSystem.lab5Patterns.state.SensorState;

//Tydzień 6, State Pattern, Konkretny stan operacyjny czujnika
public class OperationalState implements SensorState {
    @Override
    public void reportStatus() {
        System.out.println("Sensor is operational.");
    }
}
//Koniec, Tydzień 6, State Pattern