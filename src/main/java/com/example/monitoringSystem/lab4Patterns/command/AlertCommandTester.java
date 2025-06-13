//Tydzień 5, Wzorzec Command - klasa testująca komendy alertów
//Demonstruje enkapsulację żądań alertów jako obiekty komend
//Pozwala na kolejkowanie, logowanie i cofanie operacji alertów
package com.example.monitoringSystem.lab4Patterns.command;

public class AlertCommandTester {
    public static void main(String[] args) {
        AlertManager alertManager = new AlertManager();
        AlertCommandInvoker invoker = new AlertCommandInvoker();

        Command smsCmd = new TriggerSmsAlertCommand(alertManager, "Temperature too high!");
        Command emailCmd = new TriggerEmailAlertCommand(alertManager, "Pressure dropping rapidly!");
        Command pushCmd = new TriggerPushAlertCommand(alertManager, "Humidity level critical!");

        System.out.println("=== Alert Command Pattern Test ===");
        invoker.executeCommand(smsCmd);
        invoker.executeCommand(emailCmd);
        invoker.executeCommand(pushCmd);
    }
}
//Koniec, Tydzień 5, Wzorzec Command - tester alertów
