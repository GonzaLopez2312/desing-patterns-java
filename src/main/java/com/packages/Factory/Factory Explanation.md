With the Factory Pattern, we can create a specific instance of a class, based on input parameters, without having to 
specify the exact class name in our code. This pattern helps us make the process of creating new instances easier 
when the type of object we need depends on a condition, a value, or a configuration. It promotes loose coupling, since 
the code that uses the objects doesn't need to know how they are created or what their concrete types are.

In this example, the system has two wallets configured to make payments. The user can choose Mercado Libre, or Uala, and
depending on their pick, the instance of the selected wallet will be created, and the payment can be processed.