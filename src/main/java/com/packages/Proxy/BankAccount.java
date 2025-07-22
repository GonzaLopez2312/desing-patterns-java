package com.packages.Proxy;

public interface BankAccount {

    Account withdrawMoney(Account account, double amount);
    Account depositMoney(Account account, double amount);
    void showBalance(Account account);
}
