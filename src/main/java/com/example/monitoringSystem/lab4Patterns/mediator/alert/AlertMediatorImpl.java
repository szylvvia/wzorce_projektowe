//Tydzień 5, Wzorzec Mediator - konkretna implementacja mediatora alertów
//Koordynuje komunikację między sensorami a komponentami alertów
//Implementuje logikę obsługi różnych wydarzeń w systemie pomiarowym
package com.example.monitoringSystem.lab4Patterns.mediator.alert;

public class AlertMediatorImpl implements AlertMediator {
    private SensorComponentAlert sensor;
    private AlertComponent alert;

    public void register(SensorComponentAlert sensor, AlertComponent alert) {
        this.sensor = sensor;
        this.alert = alert;
    }

    @Override
    public void notify(Component sender, String event) {
        if (sender == sensor && event.equals("HighTemperature")) {
            alert.sendAlert("Temperature too high!");
        }
    }
}
//Koniec, Tydzień 5, Wzorzec Mediator - implementacja
