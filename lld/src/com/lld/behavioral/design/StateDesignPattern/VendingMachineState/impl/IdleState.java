package com.lld.behavioral.design.StateDesignPattern.VendingMachineState.impl;

import com.lld.behavioral.design.StateDesignPattern.Model.Coin;
import com.lld.behavioral.design.StateDesignPattern.VendingMachine;
import com.lld.behavioral.design.StateDesignPattern.VendingMachineState.State;

import java.util.ArrayList;
import java.util.List;

public class IdleState implements State {

    public IdleState(){
        System.out.println("\nCurrent State is IDLE State : ");
    }
    public IdleState(VendingMachine vendingMachine){
        System.out.println("\nCurrent State is IDle State : ");
        vendingMachine.setCoins(new ArrayList<>());
    }

    @Override
    public void selectInsertCoinButton(VendingMachine vendingMachine) throws Exception {
            vendingMachine.setCurrState(new HasMoneyState());
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine,Coin coin) throws Exception {
        throw new Exception("first you need to click on Insert Coin Button!!");
    }

    @Override
    public void selectProductCodeButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("first you need to click on insert coin button!!");
    }

    @Override
    public void insertProductCode(VendingMachine vendingMachine, int code) throws Exception {
    throw new Exception("You cant perform this Operation in this state !!");
    }

    @Override
    public List<Coin> refundMoney(VendingMachine vendingMachine) throws Exception {
        throw new Exception("You cant perform this Operation in this state !!");
    }

    @Override
    public int returnChange(VendingMachine vendingMachine,int change) throws Exception {
        throw new Exception("You cant perform this Operation in this state !!");
    }

    @Override
    public void dispenseProduct(VendingMachine vendingMachine) throws Exception {
        throw new Exception("You cant perform this Operation in this state !!");
    }
}
