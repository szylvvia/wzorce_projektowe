package com.example.monitoringSystem.lab4Patterns.mediator.station;

public class StationMediatorImpl implements StationMediator {
    private SensorComponentStation sensor;
    private ControllerComponent controller;

    public void register(SensorComponentStation sensor, ControllerComponent controller) {
        this.sensor = sensor;
        this.controller = controller;
    }

    @Override
    public void notify(Component sender, String event) {
        if (sender == sensor && event.equals("Detected")) {
            controller.activateProtocol();
        }
    }
}
