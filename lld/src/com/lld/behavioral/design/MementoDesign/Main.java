package com.lld.behavioral.design.MementoDesign;

public class Main {
    public static void main(String[] args) {
        /**
         * Memento Design pattern
         * In this we will store a particular state of an object whenever required and
         * restore to that state when it is required .
         */
       //Originator
        DocumentOriginator documentOriginator = new DocumentOriginator("Initial Text \n");
       //Caretaker
        DocHistoryCareTaker docHistoryCareTaker = new DocHistoryCareTaker();

        documentOriginator.setText("Another Text .\n");

        // creating memento to store the state
        DocMemento memento = documentOriginator.createMemento();
        // storing inside the history (saving state)
        docHistoryCareTaker.addDoc(memento);

        documentOriginator.setText("Again Text . \n");
        docHistoryCareTaker.addDoc(documentOriginator.createMemento());

        documentOriginator.setText("Last Text.\n");

        documentOriginator.restore(docHistoryCareTaker.undo());
        documentOriginator.restore(docHistoryCareTaker.undo());
        documentOriginator.restore(docHistoryCareTaker.undo());

        System.out.println(documentOriginator.getText());

    }
}
