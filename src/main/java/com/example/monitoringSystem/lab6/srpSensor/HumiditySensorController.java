package com.example.monitoringSystem.lab6.srpSensor;

public class HumiditySensorController implements ISensorController{
    private final HumiditySensorData humidityData;

    public HumiditySensorController(HumiditySensorData humidityData) {
        this.humidityData = humidityData;
    }

    @Override
    public void turnOn() {
        System.out.println("[CONT] Humidity Sensor is turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("[CONT] Humidity Sensor is turned off.");

    }

    @Override
    public void reset() {
        humidityData.setHumidity(0.0);
        System.out.println("[CONT] Humidity Sensor is reset.");
    }
}
