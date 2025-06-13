//Tydzień 8, Zasada DIP (Dependency Inversion Principle), abstrakcyjny generator statystyk
//Wysokopoziomowy moduł zależny od abstrakcji StatisticData zgodnie z zasadą DIP
//Wstrzykiwanie zależności zapewnia elastyczność w wyborze źródła danych
package com.example.monitoringSystem.lab7.dip.dipS.dip3;

public abstract class StatisticGenerator {
    protected StatisticData statisticData;

    public StatisticGenerator(StatisticData statisticData) {
        this.statisticData = statisticData;
    }

    public abstract void generateStats();
}
//Koniec, Tydzień 8, Zasada DIP - abstrakcyjny generator statystyk
