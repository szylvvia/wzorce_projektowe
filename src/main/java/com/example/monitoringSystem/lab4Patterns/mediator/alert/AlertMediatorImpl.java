package com.example.monitoringSystem.lab4Patterns.mediator.alert;

public class AlertMediatorImpl implements AlertMediator {
    private SensorComponentA sensor;
    private AlertComponent alert;

    public void register(SensorComponentA sensor, AlertComponent alert) {
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
