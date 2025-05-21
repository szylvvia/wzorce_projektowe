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