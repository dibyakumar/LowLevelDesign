package com.lld.behavioral.design.strategyDesign;

public class OffroadCarDrive implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Off road car Driving ........");
    }
}
