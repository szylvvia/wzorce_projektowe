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
