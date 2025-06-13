//Tydzień 5, Wzorzec Command - konkretna komenda stopu logowania
//Enkapsuluje żądanie zatrzymania logowania danych w systemie pomiarowym
//Umożliwia kontrolowane zakończenie procesu logowania przez wzorzec Command
package com.example.monitoringSystem.lab4Patterns.command;

public class StopLoggingCommand implements Command {
    private DataLogger logger;

    public StopLoggingCommand(DataLogger logger) {
        this.logger = logger;
    }

    @Override
    public void execute() {
        logger.stopLogging();
    }
}
//Koniec, Tydzień 5, Wzorzec Command - stop logowania
