package com.example.monitoringSystem.lab8.functional.example1;

//Tydzień 10, Programowanie funkcyjne, interfejs funkcyjny dla walidacji danych z czujników
@FunctionalInterface
public interface DataValidator {
    boolean validate(double value);
}
//Koniec, Tydzień 10, Programowanie funkcyjne
