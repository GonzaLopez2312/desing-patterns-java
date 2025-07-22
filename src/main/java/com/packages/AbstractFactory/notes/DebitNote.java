package com.packages.AbstractFactory.notes;

public class DebitNote implements Note {

    private int amount;

    public DebitNote(int amount) {
        this.amount = amount;
    }

    public void issueNote(){
        System.out.println("You have issued a DebitNote with an amount of " + amount);
    }

}
