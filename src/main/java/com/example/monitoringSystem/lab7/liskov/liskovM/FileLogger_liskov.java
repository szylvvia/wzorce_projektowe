//Tydzień 8, Zasada LSP - logger plików rozszerzający DataLogger
//Może zastąpić klasę bazową bez naruszania kontraktu LSP
//Dodaje specjalistyczne funkcje dla logowania do plików
package com.example.monitoringSystem.lab7.liskov.liskovM;

public class FileLogger_liskov extends DataLogger_liskov {
    @Override
    public void log(double value) {
        System.out.println("Zapisuję wartość do pliku: " + value);
    }
}

//Koniec, Tydzień 8, Zasada LSP - logger plików