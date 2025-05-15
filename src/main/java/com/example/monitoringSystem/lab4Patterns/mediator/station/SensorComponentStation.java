package com.example.monitoringSystem.lab4Patterns.mediator.station;

public class SensorComponentStation extends Component {
    public SensorComponentStation(StationMediator mediator) {
        super(mediator);
    }

    public void detect() {
        System.out.println("[Station] Sensor detected anomaly.");
        mediator.notify(this, "Detected");
    }
}
