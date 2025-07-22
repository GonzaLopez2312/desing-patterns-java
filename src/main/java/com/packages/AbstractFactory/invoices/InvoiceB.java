package com.packages.AbstractFactory.invoices;

public class InvoiceB implements Invoice{

    private String type;

    public InvoiceB() {
        type = "B";
    }

    public void issueInvoice(){
        InvoiceB invoice = new InvoiceB();
        System.out.println("Invoice issued of type" + invoice.type);
    }
}
