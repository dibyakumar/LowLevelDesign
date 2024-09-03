package com.lld.behavioral.design.MementoDesign;

public class DocumentOriginator {
    private String text;

    public DocumentOriginator(String text){
        this.text = text;
    }

    public void setText(String text){
        this.text+=text;
    }

    public String getText(){
        return this.text;
    }

    public DocMemento createMemento(){
        return new DocMemento(this.text);
    }

    public void restore(DocMemento doc){
        this.text = doc.getText();
    }
}
