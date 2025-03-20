package com.example.monitoringSystem.lab2Patterns.composite;

public class MeasurementStationCity implements CityC{
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getPollutionLevel() {
        return pollutionLevel;
    }

    public void setPollutionLevel(String pollutionLevel) {
        this.pollutionLevel = pollutionLevel;
    }

    private String cityName;
    private String pollutionLevel;

    public MeasurementStationCity(String cityName, String pollutionLevel) {
        this.cityName = cityName;
        this.pollutionLevel = pollutionLevel;
    }

    @Override
    public void showPollutions() {
        System.out.println("City: " + cityName +" Pollution level: " + pollutionLevel);
    }


}
