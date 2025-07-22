package com.packages.Proxy;

public class BankAccountImpl implements BankAccount {

    public Account withdrawMoney(Account account, double amount) {
        double currentBalance = account.getCurrentBalance() - amount;
        account.setCurrentBalance(currentBalance);
        System.out.println("Current balance: '" + currentBalance + "'");
        return account;
    }

    public Account depositMoney(Account account, double amount) {
        double currentBalance = account.getCurrentBalance() + amount;
        account.setCurrentBalance(currentBalance);
        System.out.println("Current balance: '" + currentBalance + "'");
        return account;
    }

    public void showBalance(Account account) {
        System.out.println("Current balance: '" + account.getCurrentBalance() + "'");
    }
}
