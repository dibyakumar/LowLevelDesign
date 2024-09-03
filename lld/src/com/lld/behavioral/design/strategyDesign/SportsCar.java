package com.lld.behavioral.design.strategyDesign;

public class SportsCar extends Vehicle{

    public SportsCar(SportsCarDrive strategy){
        super(strategy);
    }
}
