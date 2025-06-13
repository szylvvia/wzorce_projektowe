package com.example.monitoringSystem.lab7.dip.dipS.exceptions;

//Tydzień 9, Wyjątek dla przyszłej daty
//Niestandardowy wyjątek rzucany gdy data jest w przyszłości a nie powinna być
//Rozszerza RuntimeException dla obsługi błędów walidacji dat w systemie
public class FutureDateException extends RuntimeException {
    public FutureDateException(String message) {
        super(message);
    }
}
//Koniec, Tydzień 9, Wyjątek przyszłej daty