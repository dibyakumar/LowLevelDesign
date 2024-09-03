package com.lld.behavioral.design.StateDesignPattern.Model;

public enum Coin {
    TWO(2),ONE(1),TEN(10),FIVE(5);

    public int value;
    Coin(int value) {
    this.value = value;
    }
}
