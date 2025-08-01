## *Strategy Pattern* 

The Strategy Pattern is very useful when there are multiple strategies to offer a service. The pattern indicates
how to handle those strategies, without creating a large and unscalable class that contains all the logic. 

According to the pattern, you have to create an Interface that defines the common service to offer. Then every strategy
will implement this Interface and that method with its own logic. The class that offers the service will save 
a reference to the Interface. When the service is needed, you will set the appropriate strategy in this reference to 
offer the service, and execute the method defined in the Interface.

One important advantage that the Strategy Pattern gives us, is that the Context, the class that offers the multiple 
strategies, can change the strategy that is using dynamically, and there is no need to create another context with a
different strategy.

In the example we can see how to indicate the strategy to perform the payment to the Context, and how we can switch 
strategies dynamically.