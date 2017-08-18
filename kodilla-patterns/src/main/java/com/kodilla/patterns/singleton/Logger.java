package com.kodilla.patterns.singleton;

public class Logger {
    private static Logger logger=null;
    private Logger(){

    }
    public static Logger getInstance(){
        if(logger==null){
            logger=new Logger();
        }
        return logger;
    }

    private String lastLog = "";

    public void log(String log) {
        lastLog = log;
        System.out.println("Log: [" + log + "]");
    }

    public String getLastLog() {
        return lastLog;
    }
}