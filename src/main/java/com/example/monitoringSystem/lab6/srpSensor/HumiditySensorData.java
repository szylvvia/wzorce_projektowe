//Tydzień 7, Zasada SRP (Single Responsibility Principle), model danych czujnika wilgotności
//Odpowiedzialny tylko za przechowywanie i zarządzanie danymi czujnika
//Separacja odpowiedzialności - dane oddzielone od logiki biznesowej i prezentacji
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
//Koniec, Tydzień 7, Zasada SRP - dane czujnika wilgotności
