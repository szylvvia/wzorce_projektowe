package com.example.monitoringSystem.lab2Patterns.adapter;

import com.example.monitoringSystem.lab2Patterns.adapter.exceptions.InvalidMeasurementException;
import com.example.monitoringSystem.lab2Patterns.adapter.exceptions.OutOfRangeMeasurementException;
import com.example.monitoringSystem.lab2Patterns.adapter.exceptions.UnsupportedUnitConversionException;

public class MphWindAdapter {
    private final double kmPerHour;

    public MphWindAdapter(double kmPerHour) {
        if (kmPerHour < 0) {
            throw new InvalidMeasurementException("Wind speed cannot be negative.");
        }
        if (kmPerHour > 400) {
            throw new OutOfRangeMeasurementException("Wind speed exceeds realistic limits.");
        }
        this.kmPerHour = kmPerHour;
    }

    public double toMph() {
        return kmPerHour / 1.609;
    }

    public double toKnots() {
        throw new UnsupportedUnitConversionException("Conversion to knots is not supported.");
    }
}
