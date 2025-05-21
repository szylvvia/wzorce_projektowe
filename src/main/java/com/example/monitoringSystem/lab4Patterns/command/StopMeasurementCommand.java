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
