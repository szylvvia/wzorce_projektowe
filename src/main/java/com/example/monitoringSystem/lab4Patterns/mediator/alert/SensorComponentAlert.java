package com.example.monitoringSystem.lab4Patterns.mediator.alert;

public class SensorComponentAlert extends Component {
    public SensorComponentAlert(AlertMediator mediator) {
        super(mediator);
    }

    public void readTemperature(double value) {
        if (value > 100) {
            System.out.println("[Alert] Temperature = " + value);
            mediator.notify(this, "HighTemperature");
        }
    }
}
