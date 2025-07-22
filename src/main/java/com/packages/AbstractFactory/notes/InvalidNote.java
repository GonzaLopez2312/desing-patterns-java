package com.packages.AbstractFactory.notes;

public class InvalidNote implements Note{

    @Override
    public void issueNote() {
        System.out.println("Invalid type of note");
    }
}
