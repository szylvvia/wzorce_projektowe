package com.example.monitoringSystem.lab4Patterns.mediator.station;

public class ControllerComponent extends Component {
    public ControllerComponent(StationMediator mediator) {
        super(mediator);
    }

    public void activateProtocol() {
        System.out.println("[Station] Activating safety protocol.");
    }
}
