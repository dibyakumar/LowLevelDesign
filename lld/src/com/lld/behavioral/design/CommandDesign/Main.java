package com.lld.behavioral.design.CommandDesign;

import com.lld.behavioral.design.CommandDesign.INVOKER.command.Command;
import com.lld.behavioral.design.CommandDesign.INVOKER.command.impl.AdjustVolumeCommand;
import com.lld.behavioral.design.CommandDesign.INVOKER.command.impl.ChangeChannelCommand;
import com.lld.behavioral.design.CommandDesign.INVOKER.command.impl.TurnOnCommand;
import com.lld.behavioral.design.CommandDesign.Receiver.device.Device;
import com.lld.behavioral.design.CommandDesign.Receiver.device.impl.Stereo;
import com.lld.behavioral.design.CommandDesign.Receiver.device.impl.TV;

public class Main {
    public static void main(String[] args) {
        /**
         * Designing a Remote to control TV and Stereo
         * Command Design pattern
         */

        Device tv = new TV();
        Device stereo = new Stereo();

        RemoteController remote = new RemoteController();

        Command turnOnTV = new TurnOnCommand(tv);
        remote.setCommand(turnOnTV);
        remote.pressButton();

        Command changeChannel = new ChangeChannelCommand(new TV());
        remote.setCommand(changeChannel);
        remote.pressButton();

        Command turnOnStereo = new TurnOnCommand(stereo);
        remote.setCommand(turnOnStereo);
        remote.pressButton();

        Command adjustSound = new AdjustVolumeCommand(new Stereo());
        remote.setCommand(adjustSound);
        remote.pressButton();

    }
}
