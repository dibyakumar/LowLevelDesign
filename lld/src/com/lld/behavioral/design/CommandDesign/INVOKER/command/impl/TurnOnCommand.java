package com.lld.behavioral.design.CommandDesign.INVOKER.command.impl;

import com.lld.behavioral.design.CommandDesign.INVOKER.command.Command;
import com.lld.behavioral.design.CommandDesign.Receiver.device.Device;

public class TurnOnCommand implements Command {
    private Device device;

    public TurnOnCommand(Device device){
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOn();
    }
}
