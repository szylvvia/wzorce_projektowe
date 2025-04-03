package com.example.monitoringSystem.controllers;

import com.example.monitoringSystem.lab4Patterns.command.*;
// Mediator Calibration
import com.example.monitoringSystem.lab4Patterns.mediator.alert.AlertMediatorImpl;
import com.example.monitoringSystem.lab4Patterns.mediator.alert.SensorComponentA;
import com.example.monitoringSystem.lab4Patterns.mediator.calibration.CalibrationMediatorImpl;
import com.example.monitoringSystem.lab4Patterns.mediator.calibration.SensorComponentC;
import com.example.monitoringSystem.lab4Patterns.mediator.station.SensorComponentS;
import com.example.monitoringSystem.lab4Patterns.mediator.station.StationMediatorImpl;

import com.example.monitoringSystem.lab4Patterns.memento.Alert.AlertCaretaker;
import com.example.monitoringSystem.lab4Patterns.memento.Alert.AlertSystem;
import com.example.monitoringSystem.lab4Patterns.memento.Sensor.SensorCalibrationCaretaker;
import com.example.monitoringSystem.lab4Patterns.memento.Sensor.SensorM;
import com.example.monitoringSystem.lab4Patterns.memento.Station.MeasuringStationM;
import com.example.monitoringSystem.lab4Patterns.memento.Station.StateHistoryCaretaker;
// Iterator imports
import com.example.monitoringSystem.lab4Patterns.iterator.SensorData;
import com.example.monitoringSystem.lab4Patterns.iterator.CalibrationHistory;
import com.example.monitoringSystem.lab4Patterns.iterator.AlertHistory;

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

        System.out.println("\n=== Iterator Patterns ===");

        SensorData data = new SensorData();
        data.addMeasurement(23.5);
        data.addMeasurement(26.1);
        data.addMeasurement(22.8);

        for (double val : data) {
            System.out.println("Sensor measurement: " + val);
        }

        CalibrationHistory calibHist = new CalibrationHistory();
        calibHist.addCalibration(1.1);
        calibHist.addCalibration(1.2);
        calibHist.addCalibration(1.3);

        calibHist.getIterator().forEachRemaining(val ->
                System.out.println("Calibration history: " + val)
        );

        AlertHistory alertHist = new AlertHistory();
        alertHist.addAlert("Overheating");
        alertHist.addAlert("Low Battery");

        for (String alert : alertHist) {
            System.out.println("Alert history: " + alert);
        }

        System.out.println("\n=== Testing Mediator Pattern - Calibration ===");

        CalibrationMediatorImpl calibMediator = new CalibrationMediatorImpl();
        var calibSensor = new SensorComponentC(calibMediator);
        var calibStation = new com.example.monitoringSystem.lab4Patterns.mediator.calibration.StationComponent(calibMediator);
        calibMediator.registerComponents(calibSensor, calibStation);
        calibStation.startCalibration();

        System.out.println("\n=== Testing Mediator Pattern - Station ===");

        StationMediatorImpl stationMediator = new StationMediatorImpl();
        var stationSensor = new SensorComponentS(stationMediator);
        var controller = new com.example.monitoringSystem.lab4Patterns.mediator.station.ControllerComponent(stationMediator);
        stationMediator.register(stationSensor, controller);
        stationSensor.detect();

        System.out.println("\n=== Testing Mediator Pattern - Alert ===");

        AlertMediatorImpl alertMediator = new AlertMediatorImpl();
        var alertSensor = new SensorComponentA(alertMediator);
        var alertComponent = new com.example.monitoringSystem.lab4Patterns.mediator.alert.AlertComponent(alertMediator);
        alertMediator.register(alertSensor, alertComponent);
        alertSensor.readTemperature(105);


        return "lab4";
    }
}

