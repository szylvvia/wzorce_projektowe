package com.example.monitoringSystem.lab4Patterns.interpreter.interpreter2;

import java.util.List;
import java.util.Map;

public class EnvironmentData {
    private Map<String, List<Double>> temperatureData;
    private Map<String, List<Double>> humidityData;
    private Map<String, List<Double>> pressureData;

    public EnvironmentData(Map<String, List<Double>> temperatureData, Map<String, List<Double>> humidityData, Map<String, List<Double>> pressureData) {
        this.temperatureData = temperatureData;
        this.humidityData = humidityData;
        this.pressureData = pressureData;
    }
    public List<Double> getTemperatureData(String name) {
        return temperatureData.get(name);
    }
    public List<Double> getHumidityData(String name) {
        return humidityData.get(name);
    }
    public List<Double> getPressureData(String name) {
        return pressureData.get(name);
    }

}
