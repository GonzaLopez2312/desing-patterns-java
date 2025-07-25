package com.packages.Strategy;

public class Cash implements PaymentMethod{

    private String name = "Cash";

    public void pay(double amount){
        System.out.println("Paying with cash you have a 10% discount");
        System.out.println("The final amount is '$" + amount * 0.9 + "'");
    }

    public String getName() {
        return name;
    }
}
