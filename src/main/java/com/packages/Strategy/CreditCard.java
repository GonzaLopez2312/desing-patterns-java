package com.packages.Strategy;

public class CreditCard implements PaymentMethod{

    private String name = "Credit Card";

    public void pay(double amount){
        System.out.println("Paying with credit card includes a 8% recharge");
        System.out.println("The final amount is '$" + amount * 1.08 + "'");
    }

    public String getName() {
        return name;
    }
}
