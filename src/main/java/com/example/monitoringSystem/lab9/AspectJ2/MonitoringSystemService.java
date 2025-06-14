package com.example.monitoringSystem.lab9.AspectJ2;


import org.springframework.stereotype.Service;

//Tydzień 11, AOP - serwis systemu monitoringu z aspektami
//Klasa biznesowa z automatycznym wykrywaniem anomalii temperaturowych
//Aspekty dodają funkcjonalności bez modyfikacji kodu głównego
@Service
public class MonitoringSystemService {

    public void saveMeasurement(String sensorName, double value) {
        System.out.println("Saving measurement: " + sensorName + " = " + value);
    }

    public double readTemperature() {
        double temp = Math.random() * 100;
        System.out.println("Reading temperature: " + temp);
        return temp;
    }

    public String updateConfig(String newConfig) {
        System.out.println("Updating config to: " + newConfig);
        return newConfig;
    }
}
//Koniec, Tydzień 11, AOP - serwis systemu monitoringu


