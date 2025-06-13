//Tydzień 6, Wzorzec Strategy - strategia transmisji HTTP
//Konkretna strategia przesyłania danych przez protokół HTTP
//Wykorzystuje standardowy protokół web do komunikacji z serwerami
package com.example.monitoringSystem.lab5Patterns.strategy.DataTransmissionStrategy;

public class HttpTransmissionStrategy implements TransmissionStrategy {
    @Override
    public String transmit(String data) {
        return "Data transmitted via HTTP: " + data;
    }
}

//Koniec, Tydzień 6, Wzorzec Strategy - strategia HTTP
