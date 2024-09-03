package com.lld.behavioral.design.StateDesignPattern.VendingMachineState.impl;

import com.lld.behavioral.design.StateDesignPattern.Model.Coin;
import com.lld.behavioral.design.StateDesignPattern.VendingMachine;
import com.lld.behavioral.design.StateDesignPattern.VendingMachineState.State;

import java.util.List;

public class DispenseProductState implements State {

    public DispenseProductState(VendingMachine vendingMachine){
        System.out.println("\nIn DispenseProduct State : ");
        try {
            dispenseProduct(vendingMachine);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void selectInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("first you need to click on insert coin button!!");

    }

    @Override
    public void insertCoin(VendingMachine vendingMachine,Coin coin) throws Exception {
        throw new Exception("first you need to click on insert coin button!!");

    }

    @Override
    public void selectProductCodeButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("first you need to click on insert coin button!!");

    }

    @Override
    public void insertProductCode(VendingMachine vendingMachine, int code) throws Exception {
        throw new Exception("first you need to click on insert coin button!!");

    }

    @Override
    public List<Coin> refundMoney(VendingMachine vendingMachine) throws Exception {
        throw new Exception("first you need to click on insert coin button!!");
    }

    @Override
    public int returnChange(VendingMachine vendingMachine,int change) throws Exception {
        throw new Exception("first you need to click on insert coin button!!");
    }

    @Override
    public void dispenseProduct(VendingMachine vendingMachine) throws Exception {

        System.out.println("Product Dispensed in the Dispensed tray .");
        vendingMachine.setCurrState(new IdleState());
    }
}
