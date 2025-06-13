//Tydzień 8, Zasada DIP (Dependency Inversion Principle), interfejs transmisji danych
//Abstrakcja na którą polegają moduły wysokopoziomowe zgodnie z zasadą DIP
//Definiuje kontrakt dla różnych sposobów transmisji danych bez ujawniania szczegółów implementacji
package com.example.monitoringSystem.lab7.dip.dipK;

public interface DataTransmitter {
    void transmit(String data);
}
//Koniec, Tydzień 8, Zasada DIP - interfejs transmisji

