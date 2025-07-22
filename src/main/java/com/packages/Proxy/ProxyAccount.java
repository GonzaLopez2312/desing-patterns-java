package com.packages.Proxy;

import java.util.logging.Logger;

public class ProxyAccount implements BankAccount {

    private BankAccountImpl bankAccountImpl;
    private final static Logger LOGGER = Logger.getLogger(ProxyAccount.class.getName());

    public Account withdrawMoney(Account account, double amount) {
        LOGGER.info("------Withdrawing " + amount + " from account of user: '" + account.getUser() + "'------");
        if (bankAccountImpl == null) {
            bankAccountImpl = new BankAccountImpl();
        }
        return bankAccountImpl.withdrawMoney(account, amount);
    }

    public Account depositMoney(Account account, double amount) {
        LOGGER.info("------Depositing " + amount + " in the account of user: '" + account.getUser() + "'------");
        if (bankAccountImpl == null) {
            bankAccountImpl = new BankAccountImpl();
        }
        return bankAccountImpl.depositMoney(account, amount);
    }

    public void showBalance(Account account) {
        LOGGER.info("------Showing balance of user: '" + account.getUser() + "'------");
        if (bankAccountImpl == null) {
            bankAccountImpl = new BankAccountImpl();
        }
        bankAccountImpl.showBalance(account);
    }
}
