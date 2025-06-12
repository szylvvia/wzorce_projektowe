package com.example.monitoringSystem.lab2Patterns.adapter;

import com.example.monitoringSystem.lab2Patterns.adapter.exceptions.InvalidMeasurementException;
import com.example.monitoringSystem.lab2Patterns.adapter.exceptions.OutOfRangeMeasurementException;
import com.example.monitoringSystem.lab2Patterns.adapter.exceptions.UnsupportedUnitConversionException;

//Tydzień 3, Wzorzec Adapter, adapter konwertujący prędkość wiatru z km/h na mile na godzinę (mph)
public class MphWindAdapter {
    private final double kmPerHour;

    public MphWindAdapter(double kmPerHour) {
        int minSpeed = 0;
        int maxSpeed = 400;

        if (kmPerHour < minSpeed) {
            throw new InvalidMeasurementException("Wind speed cannot be negative.");
        }
        if (kmPerHour > maxSpeed) {
            throw new OutOfRangeMeasurementException("Wind speed exceeds realistic limits.");
        }
        this.kmPerHour = kmPerHour;
    }

    public double toMph() {
        double conversionFactor = 1.60934;
        return kmPerHour / conversionFactor;
    }    public double toKnots() {
        throw new UnsupportedUnitConversionException("Conversion to knots is not supported.");
    }
}
//Koniec, Tydzień 3, Wzorzec Adapter
