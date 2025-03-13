package com.example.monitoringSystem.controllers;

import com.example.monitoringSystem.prototype.City;
import com.example.monitoringSystem.prototype.CountryPrototype;
import com.example.monitoringSystem.singleton.DataSourceSingletonEagerInit;
import com.example.monitoringSystem.singleton.DataSourceSingletonInnerStaticClassInit;
import com.example.monitoringSystem.singleton.DataSourceSingletonStaticBlockInit;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.monitoringSystem.factory.SensorFactory;
import com.example.monitoringSystem.factory.ReportTypeFactory;
import com.example.monitoringSystem.factory.AlertFactory;
//import com.example.monitoringSystem.singleton.DataSource;
//import com.example.monitoringSystem.singleton.SensorRegistry;
//import com.example.monitoringSystem.singleton.CriticalLevels;
//import com.example.monitoringSystem.builder.ReportBuilder;
//import com.example.monitoringSystem.builder.MeasuringStationBuilder;
//import com.example.monitoringSystem.builder.NotificationBuilder;
//import com.example.monitoringSystem.prototype.CityPrototype;

import com.example.monitoringSystem.builder.MeasuringStation;
import com.example.monitoringSystem.builder.Notification;
import com.example.monitoringSystem.builder.Report;
import com.example.monitoringSystem.prototype.SensorPrototype;
import com.example.monitoringSystem.prototype.MeasuringStationP;


import java.util.List;

@Controller
public class Lab1Controller {

    @GetMapping("/lab1")
    public String lab1(Model model) {
        // Factory Pattern - creating objects
        String sensorResult = SensorFactory.createSensor("Temperature").getDetails();
        String reportResult = ReportTypeFactory.createReport("PDF").getFormat();
        String alertResult = AlertFactory.createAlert("HighTemperature").getMessage();

        model.addAttribute("sensorResult", sensorResult);
        model.addAttribute("reportResult", reportResult);
        model.addAttribute("alertResult", alertResult);

        // Prototype Pattern
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

        //Singleton Pattern
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

        // Builder Pattern
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

        return "lab1"; 
    }
}