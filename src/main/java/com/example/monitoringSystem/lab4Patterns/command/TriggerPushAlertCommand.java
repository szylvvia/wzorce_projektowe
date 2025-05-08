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
