package com.example.monitoringSystem.lab2Patterns.decorator.Alart;

// Decorator - Abstract class for additional functionality
abstract class MeasurementDecorator implements MeasurementStation {
    protected MeasurementStation station;

    public MeasurementDecorator(MeasurementStation station) {
        this.station = station;
    }

    @Override
    public String measure() {
        return station.measure();
    }
}
