package com.lld.behavioral.design.StateDesignPattern.VendingMachineState.impl;

import com.lld.behavioral.design.StateDesignPattern.Model.Coin;
import com.lld.behavioral.design.StateDesignPattern.Model.Item;
import com.lld.behavioral.design.StateDesignPattern.VendingMachine;
import com.lld.behavioral.design.StateDesignPattern.VendingMachineState.State;

import java.util.List;

public class SelectProductState implements State {

    public SelectProductState(){
        System.out.println("\nNow you are in SelectProduct State");
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
        Item item = vendingMachine.getInventory().getItem(code);
        System.out.println("Product Choosed : "+item.getType());
        // amount paid by user
        int paid = 0;
        for(Coin coin : vendingMachine.getCoins()){
            paid+=coin.value;
        }

        if(paid<item.getPrice()){
            System.out.println("Insufficient amount , please enter full amount .");
            refundMoney(vendingMachine);
            throw new Exception("Insufficient balance !!");
        }
        else{
            returnChange(vendingMachine,(paid-item.getPrice()));
            vendingMachine.setCurrState(new DispenseProductState(vendingMachine));
        }
    }

    @Override
    public List<Coin> refundMoney(VendingMachine vendingMachine) throws Exception {
        System.out.println("MoneyRefunded in the coin dispense tray . ");
        vendingMachine.setCurrState(new IdleState());
        return vendingMachine.getCoins();
    }

    @Override
    public int returnChange(VendingMachine vendingMachine,int change) throws Exception {
        System.out.println("Returning change in the dispense tray : "+change);
        return change;
    }

    @Override
    public void dispenseProduct(VendingMachine vendingMachine) throws Exception {
        throw new Exception("first you need to click on insert coin button!!");
    }
}
