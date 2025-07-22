package com.packages.AbstractFactory.invoices;

public class InvoiceA implements Invoice{

    private String type;

    public InvoiceA() {
        type = "A";
    }

    public void issueInvoice(){
        InvoiceA invoice = new InvoiceA();
        System.out.println("Invoice issued of type" + invoice.type);
    }
}
