package com.example.monitoringSystem.lab2Patterns.composite;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

//Tydzień 3, Wzorzec Composite, kompozyt grupujący pomiary dla danego miasta w hierarchii pomiarów
public class CityMeasurementsGroup implements TimeInterval {
    private String cityName;
    private List<TimeInterval> measurements = new ArrayList<>();

    @Override
    public void showMeasurement() {
        System.out.println("Pomiary dla miasta: " + cityName);
        for (TimeInterval measurement : measurements){
            measurement.showMeasurement();
        }
    }

    public CityMeasurementsGroup(String cityName, List<TimeInterval> measurements) {
        this.cityName = cityName;
        this.measurements = measurements;
    }

    public CityMeasurementsGroup(String cityName) {
        this.cityName = cityName;
    }    public void addMeasurement(TimeInterval measurement){
        this.measurements.add(measurement);
    }
}
//Koniec, Tydzień 3, Wzorzec Composite
