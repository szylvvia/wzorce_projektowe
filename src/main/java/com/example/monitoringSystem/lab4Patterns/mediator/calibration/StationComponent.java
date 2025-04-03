package com.example.monitoringSystem.lab4Patterns.mediator.calibration;

public class StationComponent extends Component {
    public StationComponent(CalibrationMediator mediator) {
        super(mediator);
    }

    public void startCalibration() {
        mediator.notify(this, "StartCalibration");
    }
}
