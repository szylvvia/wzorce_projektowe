package com.example.monitoringSystem.lab6.ocpData2;

import java.util.ArrayList;
import java.util.List;

//Tydzień 7, Zasada OCP (Open-Closed Principle), nowa implementacja czujnika bez modyfikacji istniejącego kodu
public class GrassPollenSensor implements ISensor{
    private String sensorName;
    private List<String> condition = List.of("high", "medium", "low");

    public GrassPollenSensor(String sensorName) {
        this.sensorName = sensorName;
    }    @Override
    public void readMeasurement() {
        int randomIndex = (int) (Math.random() * condition.size());
        System.out.println("[SENSOR] Reading measurement from Grass Pollen Sensor: " + sensorName+
                " - Condition: " + condition.get(randomIndex));
    }
}
//Koniec, Tydzień 7, Zasada OCP
