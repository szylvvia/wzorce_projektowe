package com.example.monitoringSystem.lab3Patterns.facade.MeasurementFacade;

public class MeasurementFacade {
    private final SensorFacade temperatureSensor;
    private final SensorFacade humiditySensor;
    private final SensorFacade pressureSensor;

    public MeasurementFacade() {
        this.temperatureSensor = new TemperatureSensorF();
        this.humiditySensor = new HumiditySensorF();
        this.pressureSensor = new PressureSensorF();
    }

    public double getTemperature() {
        return temperatureSensor.measure();
    }

    public double getHumidity() {
        return humiditySensor.measure();
    }

    public double getPressure() {
        return pressureSensor.measure();
    }
}
