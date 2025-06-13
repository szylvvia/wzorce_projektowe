//Tydzień 5, Wzorzec Command - konkretna komenda kalibracji sensora
//Enkapsuluje żądanie kalibracji sensora w stacji pomiarowej
//Umożliwia kolejkowanie, logowanie i cofanie operacji kalibracji
package com.example.monitoringSystem.lab4Patterns.command;

public class CalibrateSensorCommand implements Command {
    private MeasuringStation station;

    public CalibrateSensorCommand(MeasuringStation station) {
        this.station = station;
    }

    @Override
    public void execute() {
        station.calibrateSensor();
    }
}
//Koniec, Tydzień 5, Wzorzec Command - kalibracja sensora
