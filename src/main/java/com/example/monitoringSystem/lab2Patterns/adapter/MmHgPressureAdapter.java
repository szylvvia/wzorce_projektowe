package com.example.monitoringSystem.lab2Patterns.adapter;


import com.example.monitoringSystem.lab2Patterns.adapter.exceptions.InvalidMeasurementException;
import com.example.monitoringSystem.lab2Patterns.adapter.exceptions.OutOfRangeMeasurementException;
import com.example.monitoringSystem.lab2Patterns.adapter.exceptions.UnsupportedUnitConversionException;

public class MmHgPressureAdapter {
    private final double hpa;

    public MmHgPressureAdapter(double hpa) {
        if (hpa < 0) {
            throw new InvalidMeasurementException("Pressure cannot be negative.");
        }
        if (hpa > 2000) {
            throw new OutOfRangeMeasurementException("Pressure exceeds realistic range.");
        }
        this.hpa = hpa;
    }

    public double toMmHg() {
        return hpa * 0.75006;
    }

    public double toPsi() {
        throw new UnsupportedUnitConversionException("Conversion to PSI is not supported.");
    }
}



