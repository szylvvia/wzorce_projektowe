package com.example.monitoringSystem.lab8.functional.example2;

//Tydzień 10, Programowanie funkcyjne, interfejs funkcyjny do odczytu danych z czujników
@FunctionalInterface
public interface DataReader {
    Double readData(String sensorName, Double resolution);
}
//Koniec, Tydzień 10, Programowanie funkcyjne
