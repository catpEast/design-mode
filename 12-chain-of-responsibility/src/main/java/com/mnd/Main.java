package com.mnd;

public class Main {
    public static void main(String[] args) {
        ErrorLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        FileLogger fileLogger = new FileLogger(AbstractLogger.INFO);
        ConsoleLogger consoleLogger = new ConsoleLogger(AbstractLogger.DEBUG);
        
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        
        errorLogger.log(3, "error log...");
        
        errorLogger.log(2, "info log...");
    }
}