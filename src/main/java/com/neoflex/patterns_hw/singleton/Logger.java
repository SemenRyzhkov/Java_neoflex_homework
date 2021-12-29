package com.neoflex.patterns_hw.singleton;

public class Logger {
    private static Logger logger;
    private static String log = "Logging: \n\n";

    private Logger() {}

    public static Logger getLogger() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public void addClassAndShowInfo(Class clazz) {
        log += clazz.getName() + "\n";
        System.out.println(log);
    }
}
