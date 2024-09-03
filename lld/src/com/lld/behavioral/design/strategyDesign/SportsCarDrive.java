package com.lld.behavioral.design.strategyDesign;

public class SportsCarDrive implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Sports car Driving........");
    }
}
