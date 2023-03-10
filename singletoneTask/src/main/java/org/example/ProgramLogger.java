package org.example;

public class ProgramLogger {
    private static ProgramLogger programLogger;
    private static String logString = "Start log: \n\n";

    public static synchronized ProgramLogger getProgramLogger() {
        if (programLogger == null) {
            return new ProgramLogger();
        }
        return programLogger;
    }

    private ProgramLogger() {

    }

    public void addLogInfo(String logString) {
        this.logString += logString + "\n";
    }

    public void showLog() {
        System.out.println(logString);
    }
}
