package com.example.monitoringSystem.lab4Patterns.mediator.alert;

public class SensorComponentAlert extends Component {
    public SensorComponentAlert(AlertMediator mediator) {
        super(mediator);
    }

    public void readTemperature(double value) {
        int temperatureThreshold = 100;
        if (value > temperatureThreshold) {
            System.out.println("[Alert] Temperature = " + value);
            mediator.notify(this, "HighTemperature");
        }
    }
}
