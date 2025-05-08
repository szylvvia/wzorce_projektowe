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
