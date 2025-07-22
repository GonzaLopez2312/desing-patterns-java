package com.packages.Proxy;

public class Account {

    private Long id;
    private String user;
    private double currentBalance;

    public Account(Long id, String user, double currentBalance) {
        this.id = id;
        this.user = user;
        this.currentBalance = currentBalance;
    }

    public double getCurrentBalance(){
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance){
        this.currentBalance = currentBalance;
    }

    public Long getId() {
        return id;
    }

    public String getUser() {
        return user;
    }
}
