The Facade Pattern is used to reduce a system's complexity when working  with a library or framework that contains many 
methods, classes, or implementations, or when you need to interact with a complex subsystem, but only require a small 
part of it. Here the facade class is the only one that uses all these necessary classes and executes the logic required 
to fulfill the client's needs.

This pattern is also a good ally for keeping coupling low. In case that we have to change the library that we are working
with, the only class we would need to update is the facade, which would adjust its internal logic to handle the new library.

In this example, the library that we might be using has the classes InventoryService, InvoiceService, and PaymentService.
The OrderFacade class handle all the logic needed to place an order for a product. The system will call this method, and
won't need to know the rest of the classes or methods provided by the underlying library. 

If we run this code in Main class:  
OrderFacade orderFacade = new OrderFacade();  
orderFacade.placeOrder("River Plate T-Shirt", 500, "09122018");  

We are going to see this in the console

Checking product availability...  
Processing payment of $500.0...  
Generating invoice for user 09122018 ...  
Order placed correctly  
