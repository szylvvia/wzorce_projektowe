package com.example.monitoringSystem.controllers;

// Mediator Calibration
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.monitoringSystem.lab4Patterns.command.CalibrateSensorCommand;
import com.example.monitoringSystem.lab4Patterns.command.Command;
import com.example.monitoringSystem.lab4Patterns.command.CommandInvoker;
import com.example.monitoringSystem.lab4Patterns.command.MeasuringStation;
import com.example.monitoringSystem.lab4Patterns.command.StartMeasurementCommand;
import com.example.monitoringSystem.lab4Patterns.command.StopMeasurementCommand;
import com.example.monitoringSystem.lab4Patterns.iterator.AlertHistory;
import com.example.monitoringSystem.lab4Patterns.iterator.CalibrationHistory;
import com.example.monitoringSystem.lab4Patterns.iterator.MyIterator;
import com.example.monitoringSystem.lab4Patterns.iterator.SensorData;
import com.example.monitoringSystem.lab4Patterns.mediator.alert.AlertComponent;
import com.example.monitoringSystem.lab4Patterns.mediator.alert.AlertMediatorImpl;
import com.example.monitoringSystem.lab4Patterns.mediator.alert.SensorComponentAlert;
import com.example.monitoringSystem.lab4Patterns.mediator.calibration.CalibrationMediatorImpl;
import com.example.monitoringSystem.lab4Patterns.mediator.calibration.SensorComponentCalibration;
import com.example.monitoringSystem.lab4Patterns.mediator.calibration.StationComponent;
import com.example.monitoringSystem.lab4Patterns.mediator.station.ControllerComponent;
import com.example.monitoringSystem.lab4Patterns.mediator.station.SensorComponentStation;
import com.example.monitoringSystem.lab4Patterns.mediator.station.StationMediatorImpl;
import com.example.monitoringSystem.lab4Patterns.memento.Alert.AlertCaretaker;
import com.example.monitoringSystem.lab4Patterns.memento.Alert.AlertSystem;
import com.example.monitoringSystem.lab4Patterns.memento.Sensor.SensorCalibrationCaretaker;
import com.example.monitoringSystem.lab4Patterns.memento.Sensor.SensorMemento;
import com.example.monitoringSystem.lab4Patterns.memento.Station.MeasuringStationMemento;
import com.example.monitoringSystem.lab4Patterns.memento.Station.StateHistoryCaretaker;

//Tydzień 5, MVC Controller, Kontroler Spring Boot dla Lab4 - wzorce behawioralne podstawowe
@Controller
public class Lab4Controller {

    @GetMapping("/lab4")
    public String showLab4Page() {
        System.out.println("=== Testing Command Pattern ===");

        MeasuringStation station = new MeasuringStation();
        Command startCommand = new StartMeasurementCommand(station);
        Command stopCommand = new StopMeasurementCommand(station);
        Command calibrateCommand = new CalibrateSensorCommand(station);

        CommandInvoker invoker = new CommandInvoker();
        invoker.executeCommand(startCommand);
        invoker.executeCommand(calibrateCommand);
        invoker.executeCommand(stopCommand);

        System.out.println("\n=== Testing Memento Pattern ===");

        // Test 1: Station state
        MeasuringStationMemento station2 = new MeasuringStationMemento();
        StateHistoryCaretaker caretaker = new StateHistoryCaretaker();

        station2.setState("Idle");
        caretaker.saveMemento(station2.saveState());

        station2.setState("Measuring");
        caretaker.saveMemento(station2.saveState());

        station2.setState("Calibrating");

        station2.restoreState(caretaker.restoreMemento());
        station2.restoreState(caretaker.restoreMemento());

        // Test 2: Sensor Calibration
        SensorMemento sensor = new SensorMemento();
        SensorCalibrationCaretaker sensorCaretaker = new SensorCalibrationCaretaker();

        double basicCalibrationForSensor = 1.5;
        sensor.setCalibration(basicCalibrationForSensor);
        sensorCaretaker.saveCalibration(sensor.saveCalibration());

        double adjustedCalibrationForSensor = 2.0;
        sensor.setCalibration(adjustedCalibrationForSensor);
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

        System.out.println("\n=== Iterator Patterns ===");

        SensorData data = new SensorData();

        double valueFromSensorMorning = 22.5;
        double valueFromSensorAfternoon = 25.0;
        double valueFromSensorEvening = 20.0;

        data.addMeasurement(valueFromSensorMorning);
        data.addMeasurement(valueFromSensorAfternoon);
        data.addMeasurement(valueFromSensorEvening);

        MyIterator<Double> sensorIterator = data.createIterator();
        while (sensorIterator.hasNext()) {
            System.out.println("Sensor measurement: " + sensorIterator.next());
        }

        CalibrationHistory calibrationHistory = new CalibrationHistory();

        double advancedCalibrationForSensor = 3.0;

        calibrationHistory.addCalibration(basicCalibrationForSensor);
        calibrationHistory.addCalibration(adjustedCalibrationForSensor);
        calibrationHistory.addCalibration(advancedCalibrationForSensor);

        MyIterator<Double> calibrationHistoryIterator = calibrationHistory.createIterator();
        while (calibrationHistoryIterator.hasNext()) {
            System.out.println("Calibration history: " + calibrationHistoryIterator.next());
        }

        AlertHistory alertHist = new AlertHistory();
        alertHist.addAlert("Overheating");
        alertHist.addAlert("Low Battery");

        MyIterator<String> alertIterator = alertHist.createIterator();
        while (alertIterator.hasNext()) {
            System.out.println("Alert history: " + alertIterator.next());
        }


        System.out.println("\n=== Testing Mediator Pattern - Calibration ===");

        CalibrationMediatorImpl calibrationMediator = new CalibrationMediatorImpl();
        var sensorComponentCalibration = new SensorComponentCalibration(calibrationMediator);
        var stationComponent = new StationComponent(calibrationMediator);
        calibrationMediator.registerComponents(sensorComponentCalibration, stationComponent);
        stationComponent.startCalibration();

        System.out.println("\n=== Testing Mediator Pattern - Station ===");

        StationMediatorImpl stationMediator = new StationMediatorImpl();
        var stationSensor = new SensorComponentStation(stationMediator);
        var controllerComponent = new ControllerComponent(stationMediator);
        stationMediator.register(stationSensor, controllerComponent);
        stationSensor.detect();

        System.out.println("\n=== Testing Mediator Pattern - Alert ===");

        AlertMediatorImpl alertMediator = new AlertMediatorImpl();
        var alertSensor = new SensorComponentAlert(alertMediator);
        var alertComponent = new AlertComponent(alertMediator);
        alertMediator.register(alertSensor, alertComponent);

        int temperatureValueForAlert = 100;        alertSensor.readTemperature(temperatureValueForAlert);

        return "lab4";
    }
}
//Koniec, Tydzień 5, MVC Controller

