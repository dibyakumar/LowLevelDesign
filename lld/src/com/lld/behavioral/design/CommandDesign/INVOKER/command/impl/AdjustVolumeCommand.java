package com.lld.behavioral.design.CommandDesign.INVOKER.command.impl;

import com.lld.behavioral.design.CommandDesign.INVOKER.command.Command;
import com.lld.behavioral.design.CommandDesign.Receiver.device.impl.Stereo;

public class AdjustVolumeCommand implements Command {
    private Stereo stereo;
    public AdjustVolumeCommand(Stereo stereo){
        this.stereo = stereo;
    }
    @Override
    public void execute() {
        stereo.adjustVolume();
    }

}
