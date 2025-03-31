package com.example.monitoringSystem.lab4Patterns.command;

public class StopMeasurementCommand implements Command {
    private MeasuringStationC station;

    public StopMeasurementCommand(MeasuringStationC station) {
        this.station = station;
    }

    @Override
    public void execute() {
        station.stopMeasurement();
    }
}
