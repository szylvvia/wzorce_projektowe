package com.example.monitoringSystem.lab8.functional.example1;

//Tydzień 9, Programowanie funkcyjne, interfejs funkcyjny do formatowania alertów
@FunctionalInterface
public interface AlertFormatter {
    String format(String message, double value);
}
//Koniec, Tydzień 9, Programowanie funkcyjne
