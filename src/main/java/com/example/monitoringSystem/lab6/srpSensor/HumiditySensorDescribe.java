package com.example.monitoringSystem.lab6.srpSensor;

public class HumiditySensorDescribe implements ISensorDescribable {
    private final HumiditySensorData data;

    public HumiditySensorDescribe(HumiditySensorData data) {
        this.data = data;
    }

    @Override
    public String getDetails() {
        System.out.println("[DESC] Humidity Sensor Details: " + data.getHumidity() + "%");
        return "Humidity Sensor Details: " + data.getHumidity() + "%";
    }
}
