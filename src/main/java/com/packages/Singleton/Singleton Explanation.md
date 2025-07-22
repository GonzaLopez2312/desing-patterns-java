With the Singleton pattern, we assure that there is only one instance for a determined class. The advantage that we get,
is performance.

That's because in systems with many users, there are some classes that don't make a difference to have one for each 
user, and you can save resources, by making every user interact with the same instance.

One example in a whole system, is making the services (the classes with the logic) Singletons, due to them handling 
logic, and not data. Every user is going to use the same logic, so you don't need to have many instances of the same 
service.

The way of instantiating the class is calling the method getInstance, the one that can be called, without an instance 
thanks to being a static method. Here, the method checks if there's already an instance. In the negative case, the 
method creates the instance and returns it. In the positive case, when there's already an instance, the method just 
returns the existing instance.