//Tydzień 5, Wzorzec Memento - opiekun kalibracji sensorów
//Przechowuje historię stanów kalibracji sensorów w systemie monitoringu
//Umożliwia przywracanie poprzednich ustawień kalibracyjnych
package com.example.monitoringSystem.lab4Patterns.memento.Sensor;

import java.util.Stack;

public class SensorCalibrationCaretaker {
    private Stack<SensorCalibrationMemento> calibrationHistory = new Stack<>();

    // Metoda zapisująca stan kalibracji do historii
    public void saveCalibration(SensorCalibrationMemento memento) {
        calibrationHistory.push(memento);
    }

    // Metoda przywracająca ostatni zapisany stan kalibracji
    public SensorCalibrationMemento restoreCalibration() {
        return calibrationHistory.isEmpty() ? null : calibrationHistory.pop();
    }
}

//Koniec, Tydzień 5, Wzorzec Memento - opiekun kalibracji
