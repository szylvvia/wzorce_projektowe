//Tydzień 8, Zasada ISP - interfejs dla statystyk poziomu hałasu
//Segregacja interfejsu - specjalistyczny interfejs tylko dla analiz akustycznych
//Zgodnie z ISP - klienci implementują tylko funkcjonalności związane z hałasem
package com.example.monitoringSystem.lab7.isp.ispS.isp2;

public interface NoisyLevelStats {
    void calculateNoiseValue();
}

//Koniec, Tydzień 8, Zasada ISP - interfejs statystyk hałasu
