package com.lld.behavioral.design.TempletMethodDesign;

public class PayToMerchant extends PaymentTemplate{

    public PayToMerchant(float money,float interest){
        super(money,interest);
    }

    @Override
    public void validateRequest() {
        System.out.println("Validating Request....");
        System.out.println("Validation SuccessFull !!");
    }

    @Override
    public void debitMoney() {
        System.out.println("Money Debit : "+money);
    }

    @Override
    public void calculateFees() {
        fees = (money*(interest/100));
        System.out.println("Fees : "+fees);
    }

    @Override
    public void creditMoney() {
        System.out.println("Credited money : "+(money-fees));
    }
}
