package com.example.monitoringSystem.lab4Patterns.memento.Sensor;

//Tydzień 5, Wzorzec Memento - memento kalibracji sensora
//Snapshot ustawień kalibracyjnych sensora w określonym momencie
//Przechowuje krytyczne parametry kalibracji do późniejszego przywrócenia
public class SensorCalibrationMemento {
    private final double calibrationValue;

    public SensorCalibrationMemento(double calibrationValue) {
        this.calibrationValue = calibrationValue;
    }

    public double getCalibrationValue() {
        return calibrationValue;
    }
}
//Koniec, Tydzień 5, Wzorzec Memento - memento kalibracji
