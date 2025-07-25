The Strategy Pattern is very useful when there are multiple strategies to offer a service. The pattern indicates
how to handle those strategies, without creating a large and unscalable class that contains all the logic. 

According to the pattern, you have to create an Interface that defines the common service to offer. Then every strategy
will implement this Interface and that method with its own logic. The class that offers the service will save 
a reference to the Interface. When the service is needed, you will set the appropriate strategy in this reference to 
offer the service, and execute the method defined in the Interface.

One important advantage that the Strategy Pattern gives us, is that the Context, the class that offers the multiple 
strategies, can change the strategy that is using dynamically, and there is no need to create another context with a
different strategy.

If you execute the following code:

Cash cash = new Cash();  
CreditCard creditCard = new CreditCard();  
DebitCard debitCard = new DebitCard();  

Sale saleCash = new Sale(cash);  
saleCash.executePayment(1000.0);  

Sale saleCreditCard = new Sale(creditCard);  
saleCreditCard.executePayment(1000.0);  

Sale saleDebitCard = new Sale(debitCard);  
saleDebitCard.executePayment(1000.0);  

You will see the following in the output console.

You are going to pay with :Cash  
Paying with cash you have a 10% discount  
The final amount is '$900.0'  
You are going to pay with :Credit Card  
Paying with credit card includes a 8% recharge  
The final amount is '$1080.0'  
You are going to pay with :Debit Card  
With Debit Card there are no discounts  
The final amount is '$1000.0'  

In the example we can see how to indicate the strategy to perform the payment to the Context, and how we can switch 
strategies dynamically.