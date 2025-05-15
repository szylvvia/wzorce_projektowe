package com.example.monitoringSystem.controllers;


import com.example.monitoringSystem.lab5Patterns.observer.MeasuringStationObserver;
import com.example.monitoringSystem.lab5Patterns.observer.PressureObserver;
import com.example.monitoringSystem.lab5Patterns.observer.TemperatureObserver;
import com.example.monitoringSystem.lab5Patterns.observer.HumidityObserver;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Lab5Controller {

    @GetMapping("/lab5")
    public String showLab5Page() {
        // Set up subject and observers
        MeasuringStationObserver station = new MeasuringStationObserver();
        station.registerObserver(new TemperatureObserver());
        station.registerObserver(new PressureObserver());
        station.registerObserver(new HumidityObserver());

        // Simulate new measurement

        float temperatureFromStation = 23.5f;
        float pressureFromStation = 1013.25f;
        float humidityFromStation = 55.0f;

        station.setMeasurements(temperatureFromStation, pressureFromStation, humidityFromStation);

        return "lab5";
    }
}
