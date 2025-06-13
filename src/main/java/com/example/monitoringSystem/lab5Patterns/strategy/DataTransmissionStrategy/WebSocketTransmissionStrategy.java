//Tydzień 6, Wzorzec Strategy - strategia transmisji WebSocket
//Konkretna strategia przesyłania danych przy użyciu protokołu WebSocket
//Umożliwia dwukierunkową komunikację w czasie rzeczywistym
package com.example.monitoringSystem.lab5Patterns.strategy.DataTransmissionStrategy;

public class WebSocketTransmissionStrategy implements TransmissionStrategy {
    @Override
    public String transmit(String data) {
        return "Data transmitted via WebSocket: " + data;
    }
}
//Koniec, Tydzień 6, Wzorzec Strategy - strategia WebSocket