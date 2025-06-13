package com.example.monitoringSystem.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.monitoringSystem.lab5Patterns.observer.HumidityObserver;
import com.example.monitoringSystem.lab5Patterns.observer.MeasuringStationObserver;
import com.example.monitoringSystem.lab5Patterns.observer.PressureObserver;
import com.example.monitoringSystem.lab5Patterns.observer.TemperatureObserver;

//Tydzień 6, MVC Controller, Kontroler Spring Boot dla Lab5 - wzorce behawioralne zaawansowane
//Demonstracja wzorców Observer, Strategy, Template Method, Visitor
//Implementacja powiadomień, strategii, szablonów i odwiedzających
@Controller
public class Lab5Controller {

    @GetMapping("/lab5")
    public String showLab5Page() {
        //Tydzień 6, Wzorzec Observer 2
        //Praktyczna implementacja Observer w kontrolerze
        //Stacja powiadamia obserwatorów o nowych pomiarach
        // Set up subject and observers
        MeasuringStationObserver station = new MeasuringStationObserver();
        station.registerObserver(new TemperatureObserver());
        station.registerObserver(new PressureObserver());
        station.registerObserver(new HumidityObserver());

        // Simulate new measurement

        float temperatureFromStation = 23.5f;
        float pressureFromStation = 1013.25f;
        float humidityFromStation = 55.0f;        station.setMeasurements(temperatureFromStation, pressureFromStation, humidityFromStation);
        //Koniec, Tydzień 6, Wzorzec Observer 2

        return "lab5";
    }
}
//Koniec, Tydzień 6, MVC Controller
