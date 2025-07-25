package com.packages.Strategy;

public class Sale {

    private PaymentMethod paymentMethod;

    public Sale(PaymentMethod paymentMethod){
        this.paymentMethod = paymentMethod;
    }

    public void executePayment(Double amount){
        System.out.println("You are going to pay with: " + paymentMethod.getName());
        paymentMethod.pay(amount);
    }

    public void setPaymentMethod(PaymentMethod paymentMethod){
        this.paymentMethod = paymentMethod;
    }
}
