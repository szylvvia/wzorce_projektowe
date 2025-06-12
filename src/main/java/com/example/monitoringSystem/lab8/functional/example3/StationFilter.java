package com.example.monitoringSystem.lab8.functional.example3;

//Tydzień 9, Programowanie funkcyjne, interfejs funkcyjny do filtrowania stacji monitoringu
@FunctionalInterface
interface StationFilter {
    boolean shouldInclude(String stationName);
}
//Koniec, Tydzień 9, Programowanie funkcyjne
