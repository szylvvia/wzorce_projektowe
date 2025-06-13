//Tydzień 8, Zasada DIP (Dependency Inversion Principle), abstrakcyjna klasa transmisji danych
//Łączy interfejs z implementacją bazową, umożliwiając rozszerzanie bez modyfikacji kodu wysokopoziomowego
//Demonstruje jak DIP pozwala na tworzenie elastycznych hierarchii klas
package com.example.monitoringSystem.lab7.dip.dipK;

public abstract class AbstractDataTransmitter implements DataTransmitter {
    protected String endpoint;

    public AbstractDataTransmitter(String endpoint) {
        this.endpoint = endpoint;
    }

    public abstract void transmit(String data);
}
//Koniec, Tydzień 8, Zasada DIP - abstrakcyjna transmisja danych
