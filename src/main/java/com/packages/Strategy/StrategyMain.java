package com.packages.Strategy;

public class StrategyMain {
    public static void main(String[] args) {

        System.out.println("\n ------ STRATEGY ------ \n");

        Cash cash = new Cash();
        CreditCard creditCard = new CreditCard();
        DebitCard debitCard = new DebitCard();

        Sale saleCash = new Sale(cash);
        saleCash.executePayment(1000.0);
        System.out.println();

        Sale saleCreditCard = new Sale(creditCard);
        saleCreditCard.executePayment(1000.0);
        System.out.println();

        Sale saleDebitCard = new Sale(debitCard);
        saleDebitCard.executePayment(1000.0);
    }
}
