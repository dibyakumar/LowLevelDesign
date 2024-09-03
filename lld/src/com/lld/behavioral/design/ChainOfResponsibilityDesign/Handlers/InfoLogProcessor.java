package com.lld.behavioral.design.ChainOfResponsibilityDesign.Handlers;

import com.lld.behavioral.design.ChainOfResponsibilityDesign.LogProcessor;

public class InfoLogProcessor extends LogProcessor {

    public InfoLogProcessor(LogProcessor processor) {
        super(processor);
    }

    @Override
    public void log(int type , String message){
        if(INFO == type){
            System.out.println("INFO : "+message);
        }
        else{
            super.log(type,message);
        }
    }
}
