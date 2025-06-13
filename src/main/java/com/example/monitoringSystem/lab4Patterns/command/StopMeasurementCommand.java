//Tydzień 5, Wzorzec Command - konkretna komenda stopu pomiarów
//Enkapsuluje żądanie zatrzymania pomiarów w stacji pomiarowej
//Zapewnia kontrolowane zakończenie procesów pomiarowych w systemie
package com.example.monitoringSystem.lab4Patterns.command;

public class StopMeasurementCommand implements Command {
    private MeasuringStation station;

    public StopMeasurementCommand(MeasuringStation station) {
        this.station = station;
    }

    @Override
    public void execute() {
        station.stopMeasurement();
    }
}
//Koniec, Tydzień 5, Wzorzec Command - stop pomiarów
