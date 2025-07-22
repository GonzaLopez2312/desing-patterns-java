package com.packages.AbstractFactory.notes;

public class CreditNote implements Note{

    private int amount;

    public CreditNote(int amount) {
        this.amount = amount;
    }

    public void issueNote(){
        System.out.println("You have issued a CreditNote with an amount of " + amount);
    }
}
