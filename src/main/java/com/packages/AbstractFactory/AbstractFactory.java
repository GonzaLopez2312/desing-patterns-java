package com.packages.AbstractFactory;

import com.packages.AbstractFactory.invoices.Invoice;
import com.packages.AbstractFactory.notes.Note;

public interface AbstractFactory {
    Note getNote(String type, int amount);
    Invoice getInvoice(String type);
}
