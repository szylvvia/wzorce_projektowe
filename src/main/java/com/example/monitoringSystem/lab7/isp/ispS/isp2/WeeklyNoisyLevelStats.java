//Tydzień 8, Zasada ISP - tygodniowe statystyki poziomu hałasu
//Implementuje tylko interfejs NoisyLevelStats zgodnie z ISP
//Nie jest obciążona metodami dla temperatury czy jakości powietrza
package com.example.monitoringSystem.lab7.isp.ispS.isp2;

public class WeeklyNoisyLevelStats implements NoisyLevelStats {
    @Override
    public void calculateNoiseValue() {
        double roundingFactor = 100.0;
        System.out.println("Calculating weekly noise level statistics: " + Math.round(Math.random() * roundingFactor) / roundingFactor);
    }
}

//Koniec, Tydzień 8, Zasada ISP - statystyki hałasu tygodniowe
