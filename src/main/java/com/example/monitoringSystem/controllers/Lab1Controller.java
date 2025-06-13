package com.example.monitoringSystem.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.monitoringSystem.lab1Patterns.builder.MeasuringStation;
import com.example.monitoringSystem.lab1Patterns.builder.Notification;
import com.example.monitoringSystem.lab1Patterns.builder.Report;
import com.example.monitoringSystem.lab1Patterns.factory.AlertFactory;
import com.example.monitoringSystem.lab1Patterns.factory.ReportTypeFactory;
import com.example.monitoringSystem.lab1Patterns.factory.SensorFactory;
import com.example.monitoringSystem.lab1Patterns.prototype.City;
import com.example.monitoringSystem.lab1Patterns.prototype.CountryPrototype;
import com.example.monitoringSystem.lab1Patterns.prototype.MeasuringStationP;
import com.example.monitoringSystem.lab1Patterns.prototype.SensorPrototype;
import com.example.monitoringSystem.lab1Patterns.singleton.DataSourceSingletonEagerInit;
import com.example.monitoringSystem.lab1Patterns.singleton.DataSourceSingletonInnerStaticClassInit;
import com.example.monitoringSystem.lab1Patterns.singleton.DataSourceSingletonStaticBlockInit;

//Tydzień 2, MVC Controller, Kontroler Spring Boot dla Lab1 - wzorce kreacyjne
@Controller
public class Lab1Controller {

    @GetMapping("/lab1")
    public String lab1(Model model) {

        // Tydzien 2 - Wzorzec Factory
        String sensorResult = SensorFactory.createSensor("Temperature").getDetails();
        String reportResult = ReportTypeFactory.createReport("PDF").getFormat();
        String alertResult = AlertFactory.createAlert("HighTemperature").getMessage();
        model.addAttribute("sensorResult", sensorResult);
        model.addAttribute("reportResult", reportResult);
        model.addAttribute("alertResult", alertResult);
        // Koniec, Tydzien 2 - Wzorzec Factory

        // Tydzien 2 - Wzorzec Prototype
        SensorPrototype sensorPrototype = new SensorPrototype("Czujnik temperatury", "Podaje temperaturę w stopniach celcjusza");
        SensorPrototype clonedSensor = (SensorPrototype) sensorPrototype.clone();
        MeasuringStationP prototypeStation = new MeasuringStationP("Station B", "Los Angeles");
        MeasuringStationP clonedPrototypeStation = prototypeStation.clone();

        CountryPrototype countryPrototypeData = new CountryPrototype();
        countryPrototypeData.loadData();
        CountryPrototype countryPrototypeClone1 = (CountryPrototype) countryPrototypeData.clone();
        CountryPrototype countryPrototypeClone2 = (CountryPrototype) countryPrototypeData.clone();

        List<City> firstCountryCities = countryPrototypeClone1.getListCities();
        firstCountryCities.add(new City("Gdańsk", 470907, false));
        List<City> secondCountryCities = countryPrototypeClone2.getListCities();
        secondCountryCities.add(new City("Wrocław", 640648, false));

        model.addAttribute("sensorPrototype", clonedSensor.toString());
        model.addAttribute("prototypeStation", clonedPrototypeStation.getName() + " - " + clonedPrototypeStation.getLocalization());
        model.addAttribute("countryPrototypeData", countryPrototypeData.getListCities());
        model.addAttribute("countryPrototypeClone1", firstCountryCities);
        model.addAttribute("countryPrototypeClone2", secondCountryCities);
        // Koniec, Tydzien 2 - Wzorzec Prototype

        // Tydzien 2 - Wzorzec Singleton
        DataSourceSingletonEagerInit dataSourceSingletonEagerInit1 = DataSourceSingletonEagerInit.getInstance();
        DataSourceSingletonEagerInit dataSourceSingletonEagerInit2 = DataSourceSingletonEagerInit.getInstance();
        model.addAttribute("dataSourceSingletonEagerInit1", dataSourceSingletonEagerInit1.hashCode());
        model.addAttribute("dataSourceSingletonEagerInit2", dataSourceSingletonEagerInit2.hashCode());

        DataSourceSingletonStaticBlockInit dataSourceSingletonStaticBlockInit1 = DataSourceSingletonStaticBlockInit.getInstance();
        DataSourceSingletonStaticBlockInit dataSourceSingletonStaticBlockInit2 = DataSourceSingletonStaticBlockInit.getInstance();
        model.addAttribute("dataSourceSingletonStaticBlockInit1", dataSourceSingletonStaticBlockInit1.hashCode());
        model.addAttribute("dataSourceSingletonStaticBlockInit2", dataSourceSingletonStaticBlockInit2.hashCode());

        DataSourceSingletonInnerStaticClassInit dataSourceSingletonInnerStaticClassInit1 = DataSourceSingletonInnerStaticClassInit.getInstance();
        DataSourceSingletonInnerStaticClassInit dataSourceSingletonInnerStaticClassInit2 = DataSourceSingletonInnerStaticClassInit.getInstance();
        model.addAttribute("dataSourceSingletonInnerStaticClassInit1", dataSourceSingletonInnerStaticClassInit1.hashCode());
        model.addAttribute("dataSourceSingletonInnerStaticClassInit2", dataSourceSingletonInnerStaticClassInit2.hashCode());
        // Koniec, Tydzien 2 - Wzorzec Singleton

        // Tydzien 2 - Wzorzec Builder
        MeasuringStation measuringStation = new MeasuringStation.StationBuilder("Station A", "New York").build();
        Notification notification = new Notification.NotificationBuilder("Warning: High temperature detected!").build();
        Report report = new Report.ReportBuilder("2025-03-13", "New York", "Weather Report", measuringStation.name)
                .setPressure(1013.25)
                .setTemperature(25.5)
                .setHumidity(60.0)
                .build();
        model.addAttribute("measuringStation", measuringStation.name + " - " + measuringStation.localization);
        model.addAttribute("notification", notification.toString());
        model.addAttribute("report", report.toString());
        // Koniec, Tydzien 2 - Wzorzec Builder

        return "lab1"; 
    }
}
//Koniec, Tydzień 2, MVC Controller