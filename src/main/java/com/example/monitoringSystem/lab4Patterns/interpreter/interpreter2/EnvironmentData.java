//Tydzień 5, Wzorzec Interpreter - dane środowiskowe jako kontekst
//Encapsuluje pomiary temperatury, ciśnienia i wilgotności
//Służy jako kontekst dla ewaluacji wyrażeń interpretera anomalii
package com.example.monitoringSystem.lab4Patterns.interpreter.interpreter2;

import java.util.List;
import java.util.Map;

//Tydzień 5, Interpreter Pattern, Klasa kontekstu przechowująca dane środowiskowe dla interpreterów
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
//Koniec, Tydzień 5, Wzorzec Interpreter - kontekst środowiskowy
