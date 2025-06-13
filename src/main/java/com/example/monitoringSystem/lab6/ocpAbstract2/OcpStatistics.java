package com.example.monitoringSystem.lab6.ocpAbstract2;

//Tydzień 7, Zasada OCP (Open/Closed Principle), klasa zarządzająca operacjami statystycznymi
//Wykorzystuje polimorfizm do przetwarzania różnych typów statystyk przez wspólny interfejs
//Przykład jak OCP umożliwia rozszerzanie funkcjonalności bez modyfikacji istniejącego kodu
import java.util.List;

public class OcpStatistics {
    public void calculateAllStatistics(List<AStatistics> statisticsList) {
        for (AStatistics statistics : statisticsList) {
            statistics.calculateStatistics();
        }
    }
    public void generateAllReports(List<AStatistics> statisticsList) {
        for (AStatistics statistics : statisticsList) {
            statistics.generateReport();
        }
    }
}
//Koniec, Tydzień 7, Zasada OCP - zarządzanie statystykami
