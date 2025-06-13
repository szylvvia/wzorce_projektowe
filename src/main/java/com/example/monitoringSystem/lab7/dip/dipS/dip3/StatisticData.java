//Tydzień 8, Zasada DIP (Dependency Inversion Principle), interfejs danych statystycznych
//Abstrakcja definiująca kontrakt dla dostarczania danych do analiz statystycznych zgodnie z DIP
//Pozwala na wymienne źródła danych bez modyfikacji algorytmów statystycznych
package com.example.monitoringSystem.lab7.dip.dipS.dip3;

import java.util.List;

public interface StatisticData {
    List<Double> getTemperatureData();
    List<Double> getHumidityData();
}
//Koniec, Tydzień 8, Zasada DIP - interfejs danych statystycznych
