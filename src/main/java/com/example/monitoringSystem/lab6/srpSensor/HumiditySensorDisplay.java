package com.example.monitoringSystem.lab6.srpSensor;

public class HumiditySensorDisplay implements ISensorDisplay {
    private final HumiditySensorData data;

    public HumiditySensorDisplay(HumiditySensorData data) {
        this.data = data;
    }

    @Override
    public void showMeasurement() {
        System.out.println("[DISP] Humidity Sensor Measurement: " + data.getHumidity() + "%");
    }
}
