//Tydzień 5, Wzorzec Command - invoker dla komend logowania danych
//Zarządza wykonywaniem komend związanych z logowaniem i przechowuje ich historię
//Alternatywny invoker specjalizujący się w operacjach logowania danych pomiarowych
package com.example.monitoringSystem.lab4Patterns.command;

import java.util.ArrayList;
import java.util.List;

public class DataLoggingInvoker {
    private List<Command> commandHistory = new ArrayList<>();

    public void executeCommand(Command command) {
        command.execute();
        commandHistory.add(command);
    }

    public List<Command> getCommandHistory() {
        return commandHistory;
    }
}
//Koniec, Tydzień 5, Wzorzec Command - invoker logowania
