package com.example.monitoringSystem.lab8.functional.example1;

//Tydzień 10, Programowanie funkcyjne, interfejs funkcyjny do formatowania alertów
@FunctionalInterface
public interface AlertFormatter {
    String format(String message, double value);
}
//Koniec, Tydzień 10, Programowanie funkcyjne
