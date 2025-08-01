## *Abstract Factory Pattern*

The Abstract Factory pattern could be seen as an extension of Factory pattern. In this case, the idea is to have a 
factory of factories. The abstract factory is called by a method, and from there, the correct factory is created and 
returned, with the appropriate methods, according to what was requiered.

A known antipattern related is a violation of the 'I' from 'SOLID' principles: "The Interface Segregation Principle". 
In some cases the abstract factory collects many methods, that the specific factories must implement, even if they don't
use them.As a result, these factories might return null for methods they don’t need, since those methods are only 
relevant for other factories.

To use this pattern, we get the factory that we need using de FactoryProductor. Then, using the created factory, we get
the instance needed.