package com.example.monitoringSystem.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.monitoringSystem.lab2Patterns.adapter.*;

@Controller
public class Lab2Controller {

    @GetMapping("/lab2")
    public String showLab2Page(Model model) {
        // Adapter - konwersja temperatury
        TemperatureSensor celsiusSensor = new CelsiusSensor();
        TemperatureUnitAdapter tempAdapter = new TemperatureUnitAdapter(celsiusSensor);
        double fahrenheitTemp = tempAdapter.getTemperatureInFahrenheit();
        double kelvinTemp = tempAdapter.getTemperatureInKelvin();

        // Adapter - konwersja prędkości wiatru
        WindSpeedSensor windSensor = new KmphWindSensor();
        WindSpeedAdapter windAdapter = new MphWindAdapter(windSensor);
        double mphWindSpeed = windAdapter.getSpeed();

        // Adapter - konwersja ciśnienia
        PressureSensor pressureSensor = new HpaPressureSensor();
        PressureAdapter pressureAdapter = new MmHgPressureAdapter(pressureSensor);
        double mmHgPressure = pressureAdapter.getPressure();

        // Przekazanie danych do widoku
        model.addAttribute("fahrenheitTemp", fahrenheitTemp);
        model.addAttribute("kelvinTemp", kelvinTemp);
        model.addAttribute("mphWindSpeed", mphWindSpeed);
        model.addAttribute("mmHgPressure", mmHgPressure);

        return "lab2";
    }
}
