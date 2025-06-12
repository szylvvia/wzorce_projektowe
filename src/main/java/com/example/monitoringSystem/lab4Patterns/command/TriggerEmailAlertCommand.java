package com.example.monitoringSystem.lab4Patterns.command;

//Tydzień 5, Wzorzec Command, konkretna komenda wysyłająca alert email
public class TriggerEmailAlertCommand implements Command {
    private AlertManager alertManager;
    private String message;

    public TriggerEmailAlertCommand(AlertManager alertManager, String message) {
        this.alertManager = alertManager;
        this.message = message;
    }

    @Override
    public void execute() {
        alertManager.sendEmailAlert(message);
    }
}
//Koniec, Tydzień 5, Wzorzec Command
