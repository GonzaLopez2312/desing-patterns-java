package com.packages.Factory;

public class FactoryPaymentWallet {

    public PaymentWallet getWallet(String engine) {
        switch (engine) {
            case "Mercado Pago" -> {return new MercadoPagoPaymentWallet();}
            case "Uala" -> {return new UalaPaymentWallet();}
            default -> {return new EmptyPaymentWallet();}
        }
    }
}
