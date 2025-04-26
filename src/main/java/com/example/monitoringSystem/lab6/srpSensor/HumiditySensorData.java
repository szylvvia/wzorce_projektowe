package com.example.monitoringSystem.lab6.srpSensor;

public class HumiditySensorData {
    private String name;
    private Double humidity;

    public HumiditySensorData(String name, Double humidity) {
        this.name = name;
        this.humidity = humidity;
    }

    public Double getHumidity() {
        return humidity;
    }

    public void setHumidity(Double humidity) {
        this.humidity = humidity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
