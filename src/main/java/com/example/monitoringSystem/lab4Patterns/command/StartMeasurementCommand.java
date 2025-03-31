package com.example.monitoringSystem.lab4Patterns.command;


public class StartMeasurementCommand implements Command {
    private MeasuringStationC station;

    public StartMeasurementCommand(MeasuringStationC station) {
        this.station = station;
    }

    @Override
    public void execute() {
        station.startMeasurement();
    }
}