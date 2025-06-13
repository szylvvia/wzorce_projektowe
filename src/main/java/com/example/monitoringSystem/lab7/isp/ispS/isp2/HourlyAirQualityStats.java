//Tydzień 8, Zasada ISP - godzinowe statystyki jakości powietrza
//Implementuje tylko interfejs AirQualityStats zgodnie z ISP
//Nie jest obciążona metodami dla temperatury czy poziomu hałasu
package com.example.monitoringSystem.lab7.isp.ispS.isp2;


public class HourlyAirQualityStats implements AirQualityStats {
    @Override
    public void calculateAirQualityValue() {
        int airQualityRange = 10;
        double airQualityValue = Math.random()*airQualityRange;
        double roundingFactor = 100.0;
        System.out.println("Air Quality Value: " + Math.round(airQualityValue * roundingFactor) / roundingFactor);
    }

}
//Koniec, Tydzień 8, Zasada ISP - statystyki powietrza godzinowe
