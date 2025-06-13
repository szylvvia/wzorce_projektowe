package com.example.monitoringSystem.lab8.functional.example1;

//Tydzień 10, Programowanie funkcyjne, interfejs funkcyjny dla akcji na czujnikach
@FunctionalInterface
public interface SensorAction {
    void execute(String sensorName, double value);
}
//Koniec, Tydzień 10, Programowanie funkcyjne
