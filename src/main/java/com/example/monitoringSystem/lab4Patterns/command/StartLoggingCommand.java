//Tydzień 5, Wzorzec Command - konkretna komenda startu logowania
//Enkapsuluje żądanie rozpoczęcia logowania danych w systemie pomiarowym
//Deleguje wykonanie do obiektu DataLogger zgodnie z wzorcem Command
package com.example.monitoringSystem.lab4Patterns.command;

public class StartLoggingCommand implements Command {
    private DataLogger logger;

    public StartLoggingCommand(DataLogger logger) {
        this.logger = logger;
    }

    @Override
    public void execute() {
        logger.startLogging();
    }
}
//Koniec, Tydzień 5, Wzorzec Command - start logowania
