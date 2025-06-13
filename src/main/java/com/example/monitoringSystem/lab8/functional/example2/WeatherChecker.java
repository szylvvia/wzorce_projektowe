package com.example.monitoringSystem.lab8.functional.example2;

//Tydzień 10, Programowanie funkcyjne, interfejs funkcyjny do sprawdzania warunków pogodowych
@FunctionalInterface
public interface WeatherChecker {
    void checkWeather(Double temperature, Double humidity, Double windSpeed);
}
//Koniec, Tydzień 10, Programowanie funkcyjne
