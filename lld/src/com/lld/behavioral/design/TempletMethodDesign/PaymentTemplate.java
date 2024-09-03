package com.lld.behavioral.design.TempletMethodDesign;

public abstract class PaymentTemplate {
    float money;
    float interest;
    float fees;

    public PaymentTemplate(float money,float interest){
        this.money = money;
        this.interest = interest;
    }

    public abstract void validateRequest();
    public abstract void debitMoney();
    public abstract void calculateFees();
    public abstract void creditMoney();

    // Template
    public void sendMoney(){

        //step 1
        validateRequest();

        //step 2
        debitMoney();

        //step 3
        calculateFees();

        //step 4
        creditMoney();

    }
}
