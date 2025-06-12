package com.example.monitoringSystem.lab4Patterns.mediator.station;

//Tydzień 5, Wzorzec Mediator 1
//Mediator pattern dla komunikacji w stacji - centralizuje komunikację między komponentami
//Zmniejsza powiązania między obiektami poprzez wprowadzenie mediatora
public class StationMediatorImpl implements StationMediator {
    private SensorComponentStation sensor;
    private ControllerComponent controller;

    public void register(SensorComponentStation sensor, ControllerComponent controller) {
        this.sensor = sensor;
        this.controller = controller;
    }

    @Override
    public void notify(Component sender, String event) {        if (sender == sensor && event.equals("Detected")) {
            controller.activateProtocol();
        }
    }
}
//Koniec, Tydzień 5, Wzorzec Mediator 1
