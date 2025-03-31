package com.example.monitoringSystem.controllers;

import com.example.monitoringSystem.lab4Patterns.command.*;
import com.example.monitoringSystem.lab4Patterns.memento.Alert.AlertCaretaker;
import com.example.monitoringSystem.lab4Patterns.memento.Alert.AlertSystem;
import com.example.monitoringSystem.lab4Patterns.memento.Sensor.SensorCalibrationCaretaker;
import com.example.monitoringSystem.lab4Patterns.memento.Sensor.SensorM;
import com.example.monitoringSystem.lab4Patterns.memento.Station.MeasuringStationM;
import com.example.monitoringSystem.lab4Patterns.memento.Station.StateHistoryCaretaker;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Lab4Controller {

    @GetMapping("/lab4")
    public String showLab4Page() {
        System.out.println("=== Testing Command Pattern ===");

        MeasuringStationC station = new MeasuringStationC();
        Command startCommand = new StartMeasurementCommand(station);
        Command stopCommand = new StopMeasurementCommand(station);
        Command calibrateCommand = new CalibrateSensorCommand(station);

        CommandInvoker invoker = new CommandInvoker();
        invoker.executeCommand(startCommand);
        invoker.executeCommand(calibrateCommand);
        invoker.executeCommand(stopCommand);

        System.out.println("\n=== Testing Memento Pattern ===");

        // Test 1: Station state
        MeasuringStationM station2 = new MeasuringStationM();
        StateHistoryCaretaker caretaker = new StateHistoryCaretaker();

        station2.setState("Idle");
        caretaker.saveMemento(station2.saveState());

        station2.setState("Measuring");
        caretaker.saveMemento(station2.saveState());

        station2.setState("Calibrating");

        station2.restoreState(caretaker.restoreMemento());
        station2.restoreState(caretaker.restoreMemento());

        // Test 2: Sensor Calibration
        SensorM sensor = new SensorM();
        SensorCalibrationCaretaker sensorCaretaker = new SensorCalibrationCaretaker();

        sensor.setCalibration(1.5);
        sensorCaretaker.saveCalibration(sensor.saveCalibration());

        sensor.setCalibration(2.0);
        sensorCaretaker.saveCalibration(sensor.saveCalibration());

        sensor.restoreCalibration(sensorCaretaker.restoreCalibration());
        sensor.restoreCalibration(sensorCaretaker.restoreCalibration());

        // Test 3: Alert History
        AlertSystem alertSystem = new AlertSystem();
        AlertCaretaker alertCaretaker = new AlertCaretaker();

        alertSystem.triggerAlert("Temperature too high!");
        alertCaretaker.saveAlert(alertSystem.getLastAlert());

        alertSystem.triggerAlert("Pressure dropping!");
        alertCaretaker.saveAlert(alertSystem.getLastAlert());

        alertSystem.restoreLastAlert(alertCaretaker.restoreAlert());
        alertSystem.restoreLastAlert(alertCaretaker.restoreAlert());

        return "lab4";
    }
}

