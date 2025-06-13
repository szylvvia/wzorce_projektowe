//Tydzień 6, Wzorzec Strategy - strategia transmisji MQTT
//Konkretna strategia przesyłania danych przez protokół MQTT
//Optymalizowana dla IoT i systemów o ograniczonych zasobach
package com.example.monitoringSystem.lab5Patterns.strategy.DataTransmissionStrategy;

public class MqttTransmissionStrategy implements TransmissionStrategy {
    @Override
    public String transmit(String data) {
        return "Data transmitted via MQTT: " + data;
    }
}

//Koniec, Tydzień 6, Wzorzec Strategy - strategia MQTT
