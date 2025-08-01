package com.packages.Proxy;

public class ProxyMain {
    public static void main(String[] args) {

        System.out.println("\n ------ PROXY ------ \n");

        Account account = new Account(1L, "Gonzalo Lopez", 1000.0);
        BankAccount proxy = new ProxyAccount();
        proxy.depositMoney(account, 500.0);
        proxy.withdrawMoney(account, 300.0);
        proxy.showBalance(account);
    }
}
