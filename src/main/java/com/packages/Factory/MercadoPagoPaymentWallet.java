package com.packages.Factory;

public class MercadoPagoPaymentWallet implements PaymentWallet {

    private String host;
    private String port;
    private String user;
    private String pass;

    public MercadoPagoPaymentWallet() {
        this.host = "localhost";
        this.port = "3306";
        this.user = "root";
        this.pass = "123";
    }

    @Override
    public void pay(){
        System.out.println("You have payed using Mercado Pago");
    }
}
