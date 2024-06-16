package com.mnd;

public abstract class AbstractLogger {
    
    public static int INFO = 1;
    
    public static int DEBUG = 2;
    
    public static int ERROR = 3;
    
    protected AbstractLogger nextLogger;
    
    protected int level;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }
    
    public void log(int level, String message) {
        if (this.level <= level) {
            write(message);
        }
        
        if (nextLogger != null) {
            nextLogger.log(level, message);
        }
    }

    public abstract void write(String message);
}
