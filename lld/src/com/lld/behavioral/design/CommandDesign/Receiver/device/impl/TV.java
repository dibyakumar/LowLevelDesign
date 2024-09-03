package com.lld.behavioral.design.CommandDesign.Receiver.device.impl;

import com.lld.behavioral.design.CommandDesign.Receiver.device.Device;

public class TV implements Device {
    @Override
    public void turnOn() {
        System.out.println("TV Turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("TV Turned OFF");
    }

    public void changeChannels(){
        System.out.println("Channel Changed .");
    }
}
