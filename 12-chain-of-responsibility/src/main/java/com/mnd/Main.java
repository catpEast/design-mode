package com.mnd;

public class Main {
    public static void main(String[] args) {
        ErrorLogger errorLogger = new ErrorLogger(3);
        FileLogger fileLogger = new FileLogger(2);
        ConsoleLogger consoleLogger = new ConsoleLogger(1);
        
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        
        errorLogger.log(3, "error log...");
        
        errorLogger.log(2, "info log...");
    }
}