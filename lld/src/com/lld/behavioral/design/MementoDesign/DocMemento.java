package com.lld.behavioral.design.MementoDesign;

public class DocMemento {
    private final String text;

    public DocMemento(String text){
        this.text = text;
    }

    public String getText() {
        return this.text;
    }
}
