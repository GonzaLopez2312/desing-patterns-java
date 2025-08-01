## *Decorator Pattern*

The Decorator Pattern is very useful when you want that a specific object to adapt its behavior depending on the situation. 
One possible solution is to create an interface with multiple implementations. However, this can lead to a large number 
of implementations if there are many different situations.

The solution that this pattern provides, is to define a base component as an interface. Then you create a concrete 
component that implements this interface. On the other hand, you define an abstract class called Decorator, which also 
implements the base component interface. This abstract decorator wraps an object of the base component type. 

To complete the idea, you create different concrete decorators, each with a specific behavior you want to add to the base
component. These concrete decorators extend the abstract decorator, and implement the methods declared in the base 
component interface, modifying their behavior as needed.

With the code implemented for this pattern we have 2 different types of Enemies, base and difficult. Each one can have
helmet or armour, or both. If an enemy equips himself with armour or helmet will receive less damage.
 