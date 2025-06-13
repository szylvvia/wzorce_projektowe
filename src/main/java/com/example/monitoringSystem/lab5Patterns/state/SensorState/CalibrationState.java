package com.example.monitoringSystem.lab5Patterns.state.SensorState;

//Tydzień 6, State Pattern, Konkretny stan kalibracji czujnika
public class CalibrationState implements SensorState {
    @Override
    public void reportStatus() {
        System.out.println("Sensor is calibrating.");
    }
}
//Koniec, Tydzień 6, State Pattern
