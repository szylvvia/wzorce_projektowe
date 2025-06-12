package com.example.monitoringSystem.lab4Patterns.command;

import java.util.ArrayList;
import java.util.List;

//Tydzień 5, Wzorzec Command, invoker wykonujący komendy alertów i przechowujący historię
public class AlertCommandInvoker {
    private List<Command> commandHistory = new ArrayList<>();

    public void executeCommand(Command command) {
        command.execute();
        commandHistory.add(command);
    }    public List<Command> getCommandHistory() {
        return commandHistory;
    }
}
//Koniec, Tydzień 5, Wzorzec Command
