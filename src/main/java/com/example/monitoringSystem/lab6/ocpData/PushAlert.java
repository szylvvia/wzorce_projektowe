//Tydzień 7, Zasada OCP (Open/Closed Principle), implementacja alertu push
//Dodaje funkcjonalność powiadomień push bez modyfikacji kodu bazowego
//Przykład rozszerzalności systemu alertów zgodnie z zasadą OCP
package com.example.monitoringSystem.lab6.ocpData;

public class PushAlert implements AlertStrategy {
    @Override
    public void send(String message) {
        System.out.println("[PUSH] " + message);
    }
}
//Koniec, Tydzień 7, Zasada OCP - alert push

