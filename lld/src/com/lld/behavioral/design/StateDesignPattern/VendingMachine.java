package com.lld.behavioral.design.StateDesignPattern;

import com.lld.behavioral.design.StateDesignPattern.Model.Coin;
import com.lld.behavioral.design.StateDesignPattern.VendingMachineState.State;
import com.lld.behavioral.design.StateDesignPattern.VendingMachineState.impl.IdleState;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private State currState;
    private Inventory inventory;
    private List<Coin> coins;

    public VendingMachine(){
        this.currState = new IdleState();
        this.inventory = new Inventory(10);
        this.coins = new ArrayList<>();
    }

    public State getCurrState() {
        return currState;
    }

    public void setCurrState(State currState) {
        this.currState = currState;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public List<Coin> getCoins() {
        return coins;
    }

    public void setCoins(List<Coin> coins) {
        this.coins = coins;
    }
}
