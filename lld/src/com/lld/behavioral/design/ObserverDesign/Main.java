package com.lld.behavioral.design.ObserverDesign;

public class Main {
    public static void main(String[] args) {
        /**
         * we have two products
         * - Iphone
         * - Samsung
         * we need to notify people when new stocks comes
         */

        IphoneStock iphoneStock = new IphoneStock();
        SamsungStock samsungStock = new SamsungStock();

        NotificationObserver observer1 = new EmailNotificationObserver("DibyaKumar34@gmail.com");
        NotificationObserver observer2 = new MobileNotificationObserver("6372482870");

        iphoneStock.add(observer1);
        samsungStock.add(observer2);

        iphoneStock.setData(10);
        System.out.println("\n");
        samsungStock.setData(10);

        NotificationObserver observer3 = new EmailNotificationObserver("DiaKumari36@gmail.com");
        NotificationObserver observer4 = new MobileNotificationObserver("5372482871");

        iphoneStock.add(observer3);
        samsungStock.add(observer4);

        System.out.println("\n");
        iphoneStock.setData(10);
        System.out.println("\n");
        samsungStock.setData(10);
    }




}
