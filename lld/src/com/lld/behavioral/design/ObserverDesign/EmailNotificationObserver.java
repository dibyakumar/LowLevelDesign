package com.lld.behavioral.design.ObserverDesign;

public class EmailNotificationObserver implements NotificationObserver{

    public String email;

    public EmailNotificationObserver(String email) {
        this.email = email;
    }

    @Override
    public void update(int quantity,String product) {
        System.out.println("Sending notification to Email ID "+email+" : ");
        sendEmail(quantity,product);
    }

    public void sendEmail(int quantity,String product){
        System.out.println("New Stocks Arrived for "+product+" \n Quantity : "+quantity+"\n");
    }
}
