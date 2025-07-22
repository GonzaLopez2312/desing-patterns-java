package com.packages.AbstractFactory.invoices;

import com.packages.AbstractFactory.AbstractFactory;
import com.packages.AbstractFactory.notes.Note;

public class FactoryInvoice implements AbstractFactory {

    public Invoice getInvoice(String type){
        switch(type){
            case "A"-> {return new InvoiceA();}
            case "B"-> {return new InvoiceB();}
            default -> {return new InvoiceC();}
        }
    }

    public Note getNote(String type, int amount){
        return null;
    }
}
