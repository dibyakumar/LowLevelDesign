package com.lld.behavioral.design.StateDesignPattern;

import com.lld.behavioral.design.StateDesignPattern.Model.Coin;
import com.lld.behavioral.design.StateDesignPattern.Model.Item;
import com.lld.behavioral.design.StateDesignPattern.Model.ItemShelf;
import com.lld.behavioral.design.StateDesignPattern.Model.ItemType;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        /**
         * working of vending machine
         *
         */

        VendingMachine vendingMachine = new VendingMachine();
        addItemsToINventory(vendingMachine);
        getItemsInVendingMachine(vendingMachine);

        vendingMachine.getCurrState().selectInsertCoinButton(vendingMachine);

       // vendingMachine.getCurrState().insertCoin(vendingMachine,Coin.FIVE);
        vendingMachine.getCurrState().insertCoin(vendingMachine,Coin.TEN);
        vendingMachine.getCurrState().selectProductCodeButton(vendingMachine);

        vendingMachine.getCurrState().insertProductCode(vendingMachine,101);

    }

    private static void getItemsInVendingMachine(VendingMachine machine) {
        System.out.println("\n");
        System.out.println("Items In Vending Machine :");
        Inventory inventory = machine.getInventory();
        for(ItemShelf shelf : inventory.getItemShelves()){
            System.out.println("Code : "+shelf.getCode()+" Item : "+shelf.getItem().getType()+" Price : "+shelf.getItem().getPrice());
        }
    }

    private static void addItemsToINventory(VendingMachine vendingMachine) {
        ItemShelf[] itemShelves = vendingMachine.getInventory().getItemShelves();


        for(int i = 0 ; i<10;i++){
            Item item = new Item();
            if(i<3){
                item.setType(ItemType.COKE);
                item.setPrice(15);
                itemShelves[i].setItem(item);
                itemShelves[i].setSoldOut(false);
            }
            else if(i<6){
                item.setType(ItemType.PEPSI);
                item.setPrice(13);
                itemShelves[i].setItem(item);
                itemShelves[i].setSoldOut(false);
            }
            else if(i<8){
                item.setType(ItemType.JUICE);
                item.setPrice(20);
                itemShelves[i].setItem(item);
                itemShelves[i].setSoldOut(false);
            }
            else{
                item.setType(ItemType.SODA);
                item.setPrice(10);
                itemShelves[i].setItem(item);
                itemShelves[i].setSoldOut(false);
            }
        }

    }
}
