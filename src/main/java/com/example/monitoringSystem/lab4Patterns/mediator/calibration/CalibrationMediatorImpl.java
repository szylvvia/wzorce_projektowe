package com.example.monitoringSystem.lab4Patterns.mediator.calibration;

public class CalibrationMediatorImpl implements CalibrationMediator {
    private SensorComponentCalibration sensor;
    private StationComponent station;

    public void registerComponents(SensorComponentCalibration sensor, StationComponent station) {
        this.sensor = sensor;
        this.station = station;
    }

    @Override
    public void notify(Component sender, String event) {
        if (sender == station && event.equals("StartCalibration")) {
            sensor.calibrate();
        }
    }
}
