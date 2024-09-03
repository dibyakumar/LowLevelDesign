package com.lld.behavioral.design.ChainOfResponsibilityDesign.Handlers;

import com.lld.behavioral.design.ChainOfResponsibilityDesign.LogProcessor;

public class ErrorLogProcessor extends LogProcessor {
    public ErrorLogProcessor(LogProcessor processor) {
        super(processor);
    }

    @Override
    public void log(int type, String message) {
        if (ERROR == type) {
            System.out.println("ERROR  : " + message);
        } else {
            super.log(type, message);
        }
    }
}
