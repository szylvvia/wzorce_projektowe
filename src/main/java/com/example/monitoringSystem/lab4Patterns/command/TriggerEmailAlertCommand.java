package com.example.monitoringSystem.lab4Patterns.command;

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
