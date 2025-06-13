//Tydzień 7, Zasada OCP (Open/Closed Principle), klasa zarządzająca aktualizacjami pogody w miastach
//Wykorzystuje polimorfizm do obsługi różnych typów miast bez znajomości ich konkretnych implementacji
//Przykład jak OCP umożliwia przetwarzanie różnych obiektów przez wspólny interfejs
package com.example.monitoringSystem.lab6.ocpAbstract2;

import java.util.List;

public class OcpCity {
    public void updateWeatherInAllCity(List<ACity> cityList) {
        cityList.forEach(ACity::updateWeather);
    }
}
//Koniec, Tydzień 7, Zasada OCP - zarządzanie miastami
