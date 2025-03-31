package com.example.monitoringSystem.lab4Patterns.command;

public class CalibrateSensorCommand implements Command {
    private MeasuringStationC station;

    public CalibrateSensorCommand(MeasuringStationC station) {
        this.station = station;
    }

    @Override
    public void execute() {
        station.calibrateSensor();
    }
}
