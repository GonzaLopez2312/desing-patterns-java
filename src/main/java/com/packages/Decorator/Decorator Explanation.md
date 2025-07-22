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
 
When you run the next code:  
Enemy baseEnemy = new BaseEnemy();  
System.out.println("Damage received by base enemy: " + baseEnemy.takeDamage());  
ArmourDecorator baseEnemyWithArmour = new ArmourDecorator(baseEnemy);  
System.out.println("Damage received by base enemy with armour: " + baseEnemyWithArmour.takeDamage());  
HelmetDecorator baseEnemyWithArmourAndHelmet = new HelmetDecorator(baseEnemyWithArmour);  
System.out.println("Damage received by base enemy with armour and helmet: " + baseEnemyWithArmourAndHelmet.takeDamage());  
System.out.println();  
Enemy difficultEnemy = new DifficultEnemy();   
System.out.println("Damage received by difficult enemy: " + difficultEnemy.takeDamage());  
ArmourDecorator difficultEnemyWithArmour = new ArmourDecorator(difficultEnemy);  
System.out.println("Damage received by difficult enemy with armour: " + difficultEnemyWithArmour.takeDamage());  
HelmetDecorator difficultEnemyWithArmourAndHelmet = new HelmetDecorator(difficultEnemyWithArmour);  
System.out.println("Damage received by difficult enemy with armour and helmet: " + difficultEnemyWithArmourAndHelmet.takeDamage());  

You see this in the console:    
Damage received by base enemy: 10.0  
Damage received by base enemy with armour: 6.666666666666667  
Damage received by base enemy with armour and helmet: 3.3333333333333335  

Damage received by difficult enemy: 5.0   
Damage received by difficult enemy with armour: 3.3333333333333335  
Damage received by difficult enemy with armour and helmet: 1.6666666666666667  