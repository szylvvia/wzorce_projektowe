package com.example.monitoringSystem.lab4Patterns.mediator.alert;

public abstract class Component {
    protected AlertMediator mediator;

    public Component(AlertMediator mediator) {
        this.mediator = mediator;
    }
}
