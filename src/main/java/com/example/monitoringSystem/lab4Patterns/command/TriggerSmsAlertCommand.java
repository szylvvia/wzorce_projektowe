package com.example.monitoringSystem.lab4Patterns.command;

//Tydzień 5, Wzorzec Command, konkretna komenda wysyłająca alert SMS
public class TriggerSmsAlertCommand implements Command {
    private AlertManager alertManager;
    private String message;

    public TriggerSmsAlertCommand(AlertManager alertManager, String message) {
        this.alertManager = alertManager;
        this.message = message;
    }

    @Override
    public void execute() {
        alertManager.sendSmsAlert(message);
    }
}
//Koniec, Tydzień 5, Wzorzec Command
