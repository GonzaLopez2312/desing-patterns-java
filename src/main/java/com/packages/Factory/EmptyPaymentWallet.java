package com.packages.Factory;

public class EmptyPaymentWallet implements PaymentWallet {

    public EmptyPaymentWallet() {}

    @Override
    public void pay(){
        System.out.println("No available wallet selected for the payment");
    }
}
