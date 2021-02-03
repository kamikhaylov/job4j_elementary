package ru.job4j.patterns.singleton.logger;

public class ProgramRunner {
    public static void main(String[] args) {
        ProgramLogger.getProgramLogger().addLogInfo("Start program");
        ProgramLogger.getProgramLogger().addLogInfo("Stop program");
        ProgramLogger.getProgramLogger().showLogFile();
    }
}
