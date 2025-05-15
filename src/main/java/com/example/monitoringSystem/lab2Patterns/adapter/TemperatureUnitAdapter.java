package com.example.monitoringSystem.lab2Patterns.adapter;


import com.example.monitoringSystem.lab2Patterns.adapter.exceptions.InvalidMeasurementException;
import com.example.monitoringSystem.lab2Patterns.adapter.exceptions.OutOfRangeMeasurementException;
import com.example.monitoringSystem.lab2Patterns.adapter.exceptions.UnsupportedUnitConversionException;

public class TemperatureUnitAdapter {
    private final double celsius;

    public TemperatureUnitAdapter(double celsius) {
        if (celsius < -273.15) {
            throw new InvalidMeasurementException("Temperature cannot be below absolute zero (-273.15°C).");
        }
        if (celsius > 1000) {
            throw new OutOfRangeMeasurementException("Temperature exceeds realistic range for this system.");
        }
        this.celsius = celsius;
    }

    public double toFahrenheit() {
        double conversionFactor = 9/5.0;
        int offset = 32;
        return celsius * conversionFactor + offset;
    }

    public double toKelvin() {
        double zeroCelsius = 273.15;
        return celsius + zeroCelsius;
    }

    public double toRankine() {
        throw new UnsupportedUnitConversionException("Conversion to Rankine is not supported in this adapter.");
    }
}

