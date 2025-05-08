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
