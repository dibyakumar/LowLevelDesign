package com.lld.behavioral.design.MementoDesign;

import java.util.ArrayList;
import java.util.List;

public class DocHistoryCareTaker {
    private List<DocMemento> list;
    private int index=1;

    public DocHistoryCareTaker(){
        this.list = new ArrayList<>();
    }

    public void addDoc(DocMemento doc){
        list.add(doc);
    }

    public DocMemento undo(){
        try {
            return list.get(list.size() - (index++));
        }catch (Exception e){
            System.out.println("No History");
        }
        return null;
    }
}
