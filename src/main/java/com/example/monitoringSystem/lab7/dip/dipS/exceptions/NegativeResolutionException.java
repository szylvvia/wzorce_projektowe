package com.example.monitoringSystem.lab7.dip.dipS.exceptions;

//Tydzień 9, Wyjątek dla ujemnej rozdzielczości
//Niestandardowy wyjątek rzucany gdy rozdzielczość ma wartość ujemną lub zero
//Rozszerza RuntimeException dla obsługi błędów walidacji parametrów czujników
public class NegativeResolutionException extends RuntimeException {
    public NegativeResolutionException(String message) {
        super(message);
    }
}
//Koniec, Tydzień 9, Wyjątek ujemnej rozdzielczości