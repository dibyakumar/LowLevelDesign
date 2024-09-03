package com.lld.behavioral.design.TempletMethodDesign;

public class Main {
    public static void main(String[] args) {
        /**
         * Template method Design
         *
         * Designing a payment method
         */

        PayToFriend friend = new PayToFriend(100);
        friend.sendMoney();

        PayToMerchant merchant = new PayToMerchant(100,2);
        merchant.sendMoney();
    }
}
