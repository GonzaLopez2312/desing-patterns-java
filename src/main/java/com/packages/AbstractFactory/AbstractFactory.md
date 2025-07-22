The Abstract Factory pattern could be seen as an extension of Factory pattern. In this case, the idea is to have a 
factory of factories. The abstract factory is called by a method, and from there, the correct factory is created and 
returned, with the appropriate methods, according to what was requiered.

A known antipattern related is a violation of the 'I' from 'SOLID' principles: "The Interface Segregation Principle". 
In some cases the abstract factory collects many methods, that the specific factories must implement, even if they don't
use them.As a result, these factories might return null for methods they don’t need, since those methods are only 
relevant for other factories.

To use this pattern, we get the factory that we need using de FactoryProductor. Then, using the created factory, we get
the instance needed.

With the next code:  
AbstractFactory invoice = FactoryProductor.getFactory("invoice");  
Invoice a = invoice.getInvoice("A");  
Invoice b = invoice.getInvoice("B");  
Invoice c = invoice.getInvoice("C");  
a.issueInvoice();  
b.issueInvoice();  
c.issueInvoice();  

System.out.println("-------------------");

AbstractFactory note = FactoryProductor.getFactory("note");  
Note debit = note.getNote("Debit", 100);  
Note credit = note.getNote("Credit", 300);  
debit.issueNote();  
credit.issueNote();  

This is what we get on console:  
Invoice issued of typeA  
Invoice issued of typeB  
Invoice issued of typeC  
-------------------  
You have issued a DebitNote with an amount of 100  
You have issued a CreditNote with an amount of 300  