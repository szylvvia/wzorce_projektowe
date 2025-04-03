package com.example.monitoringSystem.lab4Patterns.mediator.station;

public abstract class Component {
    protected StationMediator mediator;

    public Component(StationMediator mediator) {
        this.mediator = mediator;
    }
}
