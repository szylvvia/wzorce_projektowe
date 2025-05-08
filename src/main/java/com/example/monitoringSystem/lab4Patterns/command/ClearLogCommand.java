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
