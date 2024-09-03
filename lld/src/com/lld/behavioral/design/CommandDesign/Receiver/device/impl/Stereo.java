package com.lld.behavioral.design.CommandDesign.Receiver.device.impl;

import com.lld.behavioral.design.CommandDesign.Receiver.device.Device;

public class Stereo implements Device {
    @Override
    public void turnOn() {
        System.out.println("Stereo Turned On");
    }

    @Override
    public void turnOff() {
        System.out.println("TV Turned On");
    }

    public void adjustVolume(){
        System.out.println("Volume Adjusted");
    }
}
