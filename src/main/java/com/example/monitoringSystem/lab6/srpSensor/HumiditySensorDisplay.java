//Tydzień 7, Zasada SRP (Single Responsibility Principle), klasa wyświetlająca dane czujnika wilgotności
//Odpowiedzialny tylko za prezentację i formatowanie danych pomiarowych
//Separacja odpowiedzialności - wyświetlanie oddzielone od danych i logiki biznesowej
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
//Koniec, Tydzień 7, Zasada SRP - wyświetlanie czujnika wilgotności
