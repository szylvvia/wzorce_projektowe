package com.example.monitoringSystem.lab2Patterns.adapter;


import com.example.monitoringSystem.lab2Patterns.adapter.exceptions.InvalidMeasurementException;
import com.example.monitoringSystem.lab2Patterns.adapter.exceptions.OutOfRangeMeasurementException;
import com.example.monitoringSystem.lab2Patterns.adapter.exceptions.UnsupportedUnitConversionException;

//Tydzień 3, Wzorzec Adapter 2
//Adapter do konwersji ciśnienia z hPa na mmHg i inne jednostki
//Zapewnia kompatybilność między różnymi standardami pomiarowymi ciśnienia
public class MmHgPressureAdapter {
    private final double hpa;

    public MmHgPressureAdapter(double hpa) {
        int minPressure = 0;
        int maxPressure = 2000;

        if (hpa < minPressure) {
            throw new InvalidMeasurementException("Pressure cannot be negative.");
        }
        if (hpa > maxPressure) {
            throw new OutOfRangeMeasurementException("Pressure exceeds realistic range.");
        }
        this.hpa = hpa;
    }

    public double toMmHg() {
        double conversionFactor = 0.75006;
        return hpa * conversionFactor;
    }    public double toPsi() {
        throw new UnsupportedUnitConversionException("Conversion to PSI is not supported.");
    }
}
//Koniec, Tydzień 3, Wzorzec Adapter 2



