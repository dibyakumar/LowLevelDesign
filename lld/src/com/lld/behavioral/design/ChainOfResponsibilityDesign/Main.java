package com.lld.behavioral.design.ChainOfResponsibilityDesign;

import com.lld.behavioral.design.ChainOfResponsibilityDesign.Handlers.DebugLogProcessor;
import com.lld.behavioral.design.ChainOfResponsibilityDesign.Handlers.ErrorLogProcessor;
import com.lld.behavioral.design.ChainOfResponsibilityDesign.Handlers.InfoLogProcessor;

public class Main {
    public static void main(String[] args) {
        /**
         * Logger implementation:
         * we have Error , Debug , Info handlers
         * we will initiate a chain of process , when the condition will satisfy there only we are going to get
         * the output
         *
         */
                                // chain of constructor
        LogProcessor processor = new ErrorLogProcessor(new DebugLogProcessor(new InfoLogProcessor(null)));

        processor.log(4,"You have Done a Mistake");
    }
}
