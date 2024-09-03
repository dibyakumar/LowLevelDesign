package com.lld.behavioral.design.StateDesignPattern.VendingMachineState.impl;

import com.lld.behavioral.design.StateDesignPattern.Model.Coin;
import com.lld.behavioral.design.StateDesignPattern.VendingMachine;
import com.lld.behavioral.design.StateDesignPattern.VendingMachineState.State;

import java.util.List;

public class HasMoneyState implements State {

    public HasMoneyState(){
        System.out.println("\nIn HasMoneyState :");
    }

    @Override
    public void selectInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("You cant perform this Operation in this state !!");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine,Coin coin) throws Exception {
        System.out.println("Inserting : "+ coin);
            vendingMachine.getCoins().add(coin);

    }

    @Override
    public void selectProductCodeButton(VendingMachine vendingMachine) throws Exception {
        vendingMachine.setCurrState(new SelectProductState());
    }

    @Override
    public void insertProductCode(VendingMachine vendingMachine, int code) throws Exception {
        throw new Exception("You cant perform this Operation in this state !!");
    }

    @Override
    public List<Coin> refundMoney(VendingMachine vendingMachine) throws Exception {
        System.out.println("MoneyRefunded in the coin dispense tray . ");
        vendingMachine.setCurrState(new IdleState());
        return vendingMachine.getCoins();
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
