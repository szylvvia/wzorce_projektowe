//Tydzień 8, Zasada ISP - dzienne statystyki temperatury
//Implementuje tylko interfejs TemperatureStats zgodnie z ISP
//Nie jest obciążona metodami dla jakości powietrza czy poziomu hałasu
package com.example.monitoringSystem.lab7.isp.ispS.isp2;

public class DailyTemperatureStats implements TemperatureStats {

    @Override
    public void calculateTemperatureValue() {
        int valueRange = 100;
        double roundingFactor = 40.0;
        double val = Math.random() * valueRange;
        System.out.println("Calculated temperature value: " + Math.round(val * roundingFactor) / roundingFactor);
    }

}

//Koniec, Tydzień 8, Zasada ISP - statystyki temperatury dzienne
