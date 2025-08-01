package com.packages.AbstractFactory;

import com.packages.AbstractFactory.invoices.Invoice;
import com.packages.AbstractFactory.notes.Note;

public class AbstractFactoryMain {

    public static void main(String[] args) {

        System.out.println("\n ------ ABSTRACT FACTORY ------ \n");

        AbstractFactory invoice = FactoryProductor.getFactory("invoice");
        Invoice a = invoice.getInvoice("A");
        Invoice b = invoice.getInvoice("B");
        Invoice c = invoice.getInvoice("C");
        a.issueInvoice();
        b.issueInvoice();
        c.issueInvoice();

        System.out.println("\n-------------------\n");

        AbstractFactory note = FactoryProductor.getFactory("note");
        Note debit = note.getNote("Debit", 100);
        Note credit = note.getNote("Credit", 300);
        debit.issueNote();
        credit.issueNote();
    }
}
