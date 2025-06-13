//Tydzień 5, Wzorzec Command - konkretna komenda wysyłająca alert push
//Enkapsuluje żądanie wysłania powiadomienia push do użytkowników systemu
//Część systemu alertów implementującego wzorzec Command dla różnych kanałów komunikacji
package com.example.monitoringSystem.lab4Patterns.command;

public class TriggerPushAlertCommand implements Command {
    private AlertManager alertManager;
    private String message;

    public TriggerPushAlertCommand(AlertManager alertManager, String message) {
        this.alertManager = alertManager;
        this.message = message;
    }

    @Override
    public void execute() {
        alertManager.sendPushAlert(message);
    }
}
//Koniec, Tydzień 5, Wzorzec Command - alert push
