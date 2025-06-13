//Tydzień 5, Wzorzec Command - konkretna komenda startu pomiarów
//Enkapsuluje żądanie uruchomienia pomiarów w stacji pomiarowej
//Implementuje interfejs Command umożliwiając kolejkowanie i cofanie operacji
package com.example.monitoringSystem.lab4Patterns.command;


public class StartMeasurementCommand implements Command {
    private MeasuringStation station;

    public StartMeasurementCommand(MeasuringStation station) {
        this.station = station;
    }

    @Override
    public void execute() {
        station.startMeasurement();
    }
}
//Koniec, Tydzień 5, Wzorzec Command - start pomiarów