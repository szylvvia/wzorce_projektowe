//Tydzień 7, Zasada OCP (Open/Closed Principle), serwis alertów z mapą strategii
//Wykorzystuje wzorzec Strategy z mapą do zarządzania różnymi typami alertów
//Otwarty na rozszerzenia o nowe typy alertów, zamknięty na modyfikacje
package com.example.monitoringSystem.lab6.ocpData;

import java.util.HashMap;
import java.util.Map;

public class AlertServiceWithMap {
    private final Map<String, AlertStrategy> strategies = new HashMap<>();

    public AlertServiceWithMap() {
        strategies.put("sms", new SmsAlert());
        strategies.put("email", new EmailAlert());
        strategies.put("push", new PushAlert());
    }

    public void send(String type, String message) {
        AlertStrategy strategy = strategies.get(type.toLowerCase());
        if (strategy != null) {
            strategy.send(message);
        } else {
            System.out.println("[UNKNOWN] No strategy for: " + type);
        }
    }
}
//Koniec, Tydzień 7, Zasada OCP - serwis alertów z mapą

