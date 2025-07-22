package com.packages.AbstractFactory.notes;

import com.packages.AbstractFactory.AbstractFactory;
import com.packages.AbstractFactory.invoices.Invoice;

public class FactoryNote implements AbstractFactory {

    public Note getNote(String type, int amount){
        switch (type){
            case "Debit" -> {return new DebitNote(amount);}
            case "Credit" -> {return new CreditNote(amount);}
            default -> {return new InvalidNote();}
        }
    }

    public Invoice getInvoice(String type){
        return null;
    }

}
