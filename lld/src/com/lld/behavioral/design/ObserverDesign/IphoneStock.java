package com.lld.behavioral.design.ObserverDesign;

import java.util.ArrayList;
import java.util.List;

public class IphoneStock implements StockObservable{
    // initially quantity
    int quantity = 0;
    // list of people who want to get notification when stock comes
    List<NotificationObserver> observers = new ArrayList<>();

    @Override
    public void add(NotificationObserver notificationObserver) {
        this.observers.add(notificationObserver);
    }

    @Override
    public void remove(NotificationObserver notificationObserver) {
    this.observers.remove(notificationObserver);
    }

    @Override
    public void setData(int data) {

        //notifying when new stocks came
        if(quantity == 0)
            notifyObservers(data);

        this.quantity+=data;
    }

    @Override
    public int getData() {
        return this.quantity;
    }

    @Override
    public void notifyObservers(int data) {
        // notifying all observers
        for(NotificationObserver observer : this.observers){
            observer.update(data,"IPhone");
        }
    }
}
