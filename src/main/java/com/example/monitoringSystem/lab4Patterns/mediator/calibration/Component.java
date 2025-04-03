package com.example.monitoringSystem.lab4Patterns.mediator.calibration;

public abstract class Component {
    protected CalibrationMediator mediator;

    public Component(CalibrationMediator mediator) {
        this.mediator = mediator;
    }
}
