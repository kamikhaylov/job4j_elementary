package ru.job4j.patterns.singleton.logger;

public class ProgramLogger {
     private static ProgramLogger programLogger;
     private static String logFile = "This is log file \n";

     private ProgramLogger() {
     }

     public static synchronized ProgramLogger getProgramLogger() {
          if (programLogger == null) {
               programLogger = new ProgramLogger();
          }
          return programLogger;
     }

     public void addLogInfo(String logInfo) {
          logFile += logInfo + "\n";
     }

     public void showLogFile() {
          System.out.println(logFile);
     }
}