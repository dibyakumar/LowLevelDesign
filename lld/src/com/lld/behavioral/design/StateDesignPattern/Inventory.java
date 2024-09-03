package com.lld.behavioral.design.StateDesignPattern;

import com.lld.behavioral.design.StateDesignPattern.Model.Item;
import com.lld.behavioral.design.StateDesignPattern.Model.ItemShelf;

import java.sql.SQLOutput;

public class Inventory {
    private ItemShelf[] itemShelves;

    public Inventory(int space){
        itemShelves = new ItemShelf[space];
        initializeShelves();
    }
    public void initializeShelves(){
        int startCode=101;
        for(int i=0;i<itemShelves.length;i++){
            itemShelves[i] = new ItemShelf();
            itemShelves[i].setCode(startCode);
            itemShelves[i].setSoldOut(true);
            startCode++;
        }
    }

    public void addItems(Item item,int code) throws Exception{
        for(ItemShelf shelf : itemShelves){
            if(shelf.getCode() == code){
                if(shelf.isSoldOut()){
                    shelf.setItem(item);
                }
                else{
                    throw new Exception("Item is Already Present");
                }
            }
        }
    }

    public Item getItem(int code) throws Exception{
        for(ItemShelf shelf : itemShelves){
            if(shelf.getCode() == code){
                if(shelf.isSoldOut()){
                    throw new Exception("Item is Sold out");
                }
                else
                    return shelf.getItem();

            }
        }
        return null;
    }


    public ItemShelf[] getItemShelves() {
        return itemShelves;
    }

    public void setItemShelves(ItemShelf[] itemShelves) {
        this.itemShelves = itemShelves;
    }
}
