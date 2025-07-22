package com.packages.AbstractFactory.invoices;

public class InvoiceC implements Invoice{
    private String type;

    public InvoiceC() {
        type = "C";
    }

    public void issueInvoice(){
        InvoiceC invoice = new InvoiceC();
        System.out.println("Invoice issued of type" + invoice.type);
    }
}
