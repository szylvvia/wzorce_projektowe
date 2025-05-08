package com.example.monitoringSystem.lab4Patterns.command;

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
