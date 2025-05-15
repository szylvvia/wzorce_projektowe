package com.example.monitoringSystem.lab4Patterns.mediator.calibration;

public class SensorComponentCalibration extends Component {
    public SensorComponentCalibration(CalibrationMediator mediator) {
        super(mediator);
    }

    public void calibrate() {
        System.out.println("[Calibration] Sensor is calibrating...");
    }
}
