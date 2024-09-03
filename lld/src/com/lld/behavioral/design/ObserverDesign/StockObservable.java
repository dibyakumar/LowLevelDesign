package com.lld.behavioral.design.ObserverDesign;

public interface StockObservable {
    void add(NotificationObserver notificationObserver);
    void remove(NotificationObserver notificationObserver);
    void setData(int data);
    int getData();
    void notifyObservers(int data);
}
