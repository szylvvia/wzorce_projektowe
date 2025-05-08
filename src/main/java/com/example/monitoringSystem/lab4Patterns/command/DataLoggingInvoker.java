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
