package com.packages;

import com.packages.Observer.*;
import com.packages.Strategy.Cash;
import com.packages.Strategy.CreditCard;
import com.packages.Strategy.DebitCard;
import com.packages.Strategy.Sale;

public class Main {
    public static void main(String[] args) {

        Cash cash = new Cash();
        CreditCard creditCard = new CreditCard();
        DebitCard debitCard = new DebitCard();

        Sale saleCash = new Sale(cash);
        saleCash.executePayment(1000.0);

        Sale saleCreditCard = new Sale(creditCard);
        saleCreditCard.executePayment(1000.0);

        Sale saleDebitCard = new Sale(debitCard);
        saleDebitCard.executePayment(1000.0);

        saleDebitCard.setPaymentMethod(cash);
        saleDebitCard.executePayment(1000.0);

    }
}