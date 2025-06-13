//Tydzień 5, Wzorzec Iterator - kolekcja historii alertów
//Agregat przechowujący alerty i zapewniający dostęp przez iterator
//Umożliwia sekwencyjny dostęp do alertów bez ujawniania wewnętrznej struktury
package com.example.monitoringSystem.lab4Patterns.iterator;

public class AlertHistory {
    private String[] alerts = new String[50];
    private int count = 0;

    public void addAlert(String alert) {
        if (count < alerts.length) {
            alerts[count++] = alert;
        }
    }

    public MyIterator<String> createIterator() {
        return new AlertHistoryIterator(alerts, count);
    }
}
//Koniec, Tydzień 5, Wzorzec Iterator - Agregat
