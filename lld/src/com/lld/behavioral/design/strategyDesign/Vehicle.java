package com.lld.behavioral.design.strategyDesign;

public class Vehicle {
    private DriveStrategy strategy;

    public Vehicle(DriveStrategy strategy){
        this.strategy = strategy;
    }

    public void drive(){
        this.strategy.drive();
    }
}
