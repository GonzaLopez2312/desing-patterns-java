package com.packages.Strategy;

public interface PaymentMethod {
    void pay(double amount);
    String getName();
}
