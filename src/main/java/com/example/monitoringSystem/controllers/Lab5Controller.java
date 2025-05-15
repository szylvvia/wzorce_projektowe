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
        station.setMeasurements(23.5f, 1013.25f, 55.0f);

        return "lab5";
    }
}
