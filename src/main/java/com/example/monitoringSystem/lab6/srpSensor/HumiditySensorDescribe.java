//Tydzień 7, Zasada SRP (Single Responsibility Principle), klasa opisująca czujnik wilgotności
//Odpowiedzialny tylko za generowanie opisów i szczegółów czujnika
//Separacja odpowiedzialności - opis oddzielony od danych i kontroli
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
//Koniec, Tydzień 7, Zasada SRP - opis czujnika wilgotności
