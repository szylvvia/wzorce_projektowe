//Tydzień 3, Wzorzec Adapter - wyjątek dla nieprawidłowych pomiarów
//Rzucany gdy pomiar wykracza poza dozwolone wartości (np. poniżej zera bezwzględnego)
//Część systemu walidacji w wzorcu Adapter dla konwersji jednostek
package com.example.monitoringSystem.lab2Patterns.adapter.exceptions;

public class InvalidMeasurementException extends RuntimeException {
    public InvalidMeasurementException(String message) {
        super(message);
    }
}
//Koniec, Tydzień 3, Wyjątek wzorca Adapter

