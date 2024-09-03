package com.lld.behavioral.design.CommandDesign;

import com.lld.behavioral.design.CommandDesign.INVOKER.command.Command;

public class RemoteController {
private Command command;

public void setCommand(Command command){
    this.command = command;
}

public void pressButton(){
    command.execute();
}
}
