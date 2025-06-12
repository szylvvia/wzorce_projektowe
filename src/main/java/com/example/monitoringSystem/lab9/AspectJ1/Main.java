package com.example.monitoringSystem.lab9.AspectJ1;

import com.example.monitoringSystem.lab9.AspectJ1.MeasurementStation;

//Tydzień 10, Aspect Oriented Programming 1
//AOP z AspectJ - separacja zagadnień przekrojowych od logiki biznesowej
//Automatyczne logowanie i pomiar czasu wykonania metod przy użyciu aspektów
public class Main {
    public static void main(String[] args) {
        MeasurementStation station = new MeasurementStation();        System.out.println("Temperature: " + station.getTemperature());
        System.out.println("Humidity: " + station.getHumidity());
    }
}
//Koniec, Tydzień 10, Aspect Oriented Programming 1
