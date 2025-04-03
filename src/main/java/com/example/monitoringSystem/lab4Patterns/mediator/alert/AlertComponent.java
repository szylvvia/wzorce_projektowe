package com.example.monitoringSystem.lab4Patterns.mediator.alert;

public class AlertComponent extends Component {
    public AlertComponent(AlertMediator mediator) {
        super(mediator);
    }

    public void sendAlert(String msg) {
        System.out.println("!!! ALERT: " + msg);
    }
}
