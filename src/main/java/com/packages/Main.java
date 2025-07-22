package com.packages;


import com.packages.Proxy.Account;
import com.packages.Proxy.BankAccount;
import com.packages.Proxy.ProxyAccount;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {

        Account account = new Account(1L, "Gonzalo Lopez", 1000.0);
        BankAccount proxy = new ProxyAccount();
        proxy.depositMoney(account, 500.0);
        proxy.withdrawMoney(account, 300.0);
        proxy.showBalance(account);
    }
}