//Tydzień 7, Zasada SRP (Single Responsibility Principle), kontroler czujnika wilgotności
//Odpowiedzialny tylko za operacje sterujące czujnikiem (włączanie, wyłączanie, reset)
//Separacja odpowiedzialności - kontrola oddzielona od danych i wyświetlania
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
//Koniec, Tydzień 7, Zasada SRP - kontroler czujnika wilgotności
