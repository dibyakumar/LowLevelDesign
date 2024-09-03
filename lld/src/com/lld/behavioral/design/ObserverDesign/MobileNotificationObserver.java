package com.lld.behavioral.design.ObserverDesign;

import java.util.List;

public class MobileNotificationObserver implements NotificationObserver{

    private final String mobile_number;

    public MobileNotificationObserver(String mobile_number) {
        this.mobile_number = mobile_number;
    }

    @Override
    public void update(int quantity,String product) {
        System.out.println("Sending notification to Mobile number "+mobile_number+" : ");
      sendMesg(quantity,product);

    }

    public void sendMesg(int quatity,String product){
        System.out.println("New Stocks Arrived for "+product+" \n Quantity : "+quatity+"\n");
    }
}
