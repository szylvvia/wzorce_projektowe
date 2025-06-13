package com.example.monitoringSystem.lab7.dip.dipK;

//Tydzień 8, Zasada DIP (Dependency Inversion Principle), serwis monitoringu zależny od abstrakcji
//Wysokopoziomowy moduł wykorzystujący abstrakcję DataTransmitter zgodnie z DIP
//Wstrzykiwanie zależności przez konstruktor zapewnia elastyczność i testowalnośc
public class MonitoringService {
    private final DataTransmitter transmitter;

    public MonitoringService(DataTransmitter transmitter) {
        this.transmitter = transmitter;
    }

    public void sendData(String reading) {
        transmitter.transmit(reading);
    }
}
//Koniec, Tydzień 8, Zasada DIP - serwis monitoringu

