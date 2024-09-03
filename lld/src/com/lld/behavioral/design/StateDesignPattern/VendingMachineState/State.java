package com.lld.behavioral.design.StateDesignPattern.VendingMachineState;

import com.lld.behavioral.design.StateDesignPattern.Model.Coin;
import com.lld.behavioral.design.StateDesignPattern.VendingMachine;

import java.util.List;

public interface State {
    void selectInsertCoinButton(VendingMachine vendingMachine) throws Exception;
    void insertCoin(VendingMachine vendingMachine,Coin coin) throws Exception;
    void selectProductCodeButton(VendingMachine vendingMachine) throws Exception;
    void insertProductCode(VendingMachine vendingMachine,int code) throws  Exception;
    List<Coin> refundMoney(VendingMachine vendingMachine)throws  Exception;
    int returnChange(VendingMachine vendingMachine,int change) throws Exception;
    void dispenseProduct(VendingMachine vendingMachine) throws Exception;
}
