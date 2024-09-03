package com.lld.behavioral.design.ChainOfResponsibilityDesign;

public abstract class LogProcessor {
    public static final int INFO = 1;
    public static final int ERROR = 2;
    public static final int DEBUG = 3;

    private final LogProcessor processor;

    public LogProcessor(LogProcessor processor){
        this.processor = processor;
    }

    public void log(int type,String message){
        if(processor != null){
            processor.log(type,message);
        }
        else{
            System.out.println("Processor Not Available !!");
        }
    }
}
