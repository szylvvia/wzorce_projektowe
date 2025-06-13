//Tydzień 5, Wzorzec Command - konkretna komenda czyszczenia logów
//Enkapsuluje żądanie wyczyszczenia logów danych pomiarowych
//Deleguje wykonanie do obiektu DataLogger zgodnie z wzorcem Command
package com.example.monitoringSystem.lab4Patterns.command;

public class ClearLogCommand implements Command {
    private DataLogger logger;

    public ClearLogCommand(DataLogger logger) {
        this.logger = logger;
    }

    @Override
    public void execute() {
        logger.clearLog();
    }
}
//Koniec, Tydzień 5, Wzorzec Command - czyszczenie logów
