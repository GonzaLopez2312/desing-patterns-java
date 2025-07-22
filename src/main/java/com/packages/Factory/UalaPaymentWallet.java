package com.packages.Factory;

public class UalaPaymentWallet implements PaymentWallet {

    private String host;
    private String port;
    private String user;
    private String pass;

    public UalaPaymentWallet() {
        this.host = "localhost";
        this.port = "5432";
        this.user = "postgres";
        this.pass = "postgres";
    }

    @Override
    public void pay(){
        System.out.println("You have payed using Uala");
    }

}
