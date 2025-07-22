package com.packages.AbstractFactory;

import com.packages.AbstractFactory.invoices.FactoryInvoice;
import com.packages.AbstractFactory.notes.FactoryNote;

public class FactoryProductor {

    public static AbstractFactory getFactory(String factoryType) {
        switch (factoryType) {
            case "note" -> {return new FactoryNote();}
            case "invoice" -> {return new FactoryInvoice();}
            default -> {return null;}
        }
    }
}
