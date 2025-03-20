package com.example.monitoringSystem.lab2Patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class MeasurementStationRegion implements CityC{
    private String name;
    private List<MeasurementStationCity> measurementStationCityList = new ArrayList<>();

    public MeasurementStationRegion(List<MeasurementStationCity> measurementStationCityList, String name) {
        this.measurementStationCityList = measurementStationCityList;
        this.name = name;
    }

    @Override
    public void showPollutions() {
        System.out.println("Wszystkie stacje pomiarowe w regionie: "+ name);
        for(MeasurementStationCity measurementStationCity : measurementStationCityList){
            measurementStationCity.showPollutions();
        }
    }

    public void addCity(MeasurementStationCity measurementStationCity){
        measurementStationCityList.add(measurementStationCity);
    }

    public void removeCity(MeasurementStationCity measurementStationCity){
        measurementStationCityList.remove(measurementStationCity);
    }

}
