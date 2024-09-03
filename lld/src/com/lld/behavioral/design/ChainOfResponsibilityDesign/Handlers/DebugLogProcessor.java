package com.lld.behavioral.design.ChainOfResponsibilityDesign.Handlers;

import com.lld.behavioral.design.ChainOfResponsibilityDesign.LogProcessor;

public class DebugLogProcessor extends LogProcessor {
    public DebugLogProcessor(LogProcessor processor) {
        super(processor);
    }

    @Override
    public void log(int type, String message) {

        if (DEBUG == type) {
            System.out.println("DEBUG : "+message);
        } else {
            super.log(type, message);
        }
    }
}
