package com.example.monitoringSystem.lab4Patterns.mediator.calibration;

public class SensorComponentC extends Component {
    public SensorComponentC(CalibrationMediator mediator) {
        super(mediator);
    }

    public void calibrate() {
        System.out.println("[Calibration] Sensor is calibrating...");
    }
}
