package com.lld.behavioral.design.CommandDesign.INVOKER.command.impl;

import com.lld.behavioral.design.CommandDesign.INVOKER.command.Command;
import com.lld.behavioral.design.CommandDesign.Receiver.device.impl.TV;

public class ChangeChannelCommand implements Command {
    public TV tv;
    public ChangeChannelCommand(TV tv){
        this.tv = tv;
    }
    @Override
    public void execute() {
        tv.changeChannels();
    }
}
