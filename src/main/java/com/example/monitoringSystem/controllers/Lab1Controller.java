package com.example.monitoringSystem.controllers;

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
import com.example.monitoringSystem.prototype.SensorPrototype;

@Controller
public class Lab1Controller {

    @GetMapping("/lab1")
    public String lab1(Model model) {
        // Factory Pattern
        String sensorResult = SensorFactory.createSensor("Temperature").getDetails();
        String reportResult = ReportTypeFactory.createReport("PDF").getFormat();
        String alertResult = AlertFactory.createAlert("HighTemperature").getMessage();

        // Prototype Pattern
        SensorPrototype sensorPrototype = new SensorPrototype("Czujnik temperatury", "Podaje temperaturę w stopniach celcjusza");
        SensorPrototype clonedSensor = (SensorPrototype) sensorPrototype.clone();

        model.addAttribute("sensorResult", sensorResult);
        model.addAttribute("reportResult", reportResult);
        model.addAttribute("alertResult", alertResult);
        model.addAttribute("sensorPrototype", clonedSensor.toString());

        return "lab1"; 
    }
}