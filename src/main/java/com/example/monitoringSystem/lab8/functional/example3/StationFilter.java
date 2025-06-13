package com.example.monitoringSystem.lab8.functional.example3;

//Tydzień 10, Programowanie funkcyjne, interfejs funkcyjny do filtrowania stacji monitoringu
@FunctionalInterface
interface StationFilter {
    boolean shouldInclude(String stationName);
}
//Koniec, Tydzień 10, Programowanie funkcyjne
