package com.packages.Strategy;

public class DebitCard implements PaymentMethod{

    private String name = "Debit Card";

    public void pay(double amount){
        System.out.println("With Debit Card there are no discounts");
        System.out.println("The final amount is '$" + amount + "'");
    }

    public String getName() {
        return name;
    }
}
