package com.KA.algorithm.patterns.singleton;

public class ProgramLogger { // синхронайзд для многопоточных программ
    private static ProgramLogger programLogger;
    private static String logfile = "This is log file. /n/n";

    private ProgramLogger() {
    }

    public static ProgramLogger getProgramLogger() {
        if (programLogger == null) {
            programLogger = new ProgramLogger();
        }
        return programLogger;
    }

    public String addLog(String log) {
        return logfile.concat("\n" + log);
    }
}