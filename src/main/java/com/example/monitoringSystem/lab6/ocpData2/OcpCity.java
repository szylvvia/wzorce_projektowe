package com.example.monitoringSystem.lab6.ocpData2;

//Tydzień 7, Zasada OCP (Open/Closed Principle), zarządzanie operacjami na miastach
//Wykorzystuje polimorfizm do obsługi różnych typów miast przez wspólny interfejs
//Demonstruje jak OCP pozwala na dodawanie nowych miast bez zmiany logiki przetwarzania
import java.util.List;

public class OcpCity {
    public void checkWeatherInAllCities(List<ICity> cities) {
        for (ICity city : cities) {
            city.checkWeather();
        }
    }
}
//Koniec, Tydzień 7, Zasada OCP - zarządzanie miastami
