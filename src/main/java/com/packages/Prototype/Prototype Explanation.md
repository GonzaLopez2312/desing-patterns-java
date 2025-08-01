## *Prototype Pattern*

The Prototype pattern is used when creating an instance from scratches is laborious. Here we use the clone() method from 
the Cloneable Interface, and cast the result to the requiered class.

To use this pattern, we have to make the class that we may clone, implement Cloneable, and define the clone() method in a 
try catch block. In case the cloning fails, the method will throw a CloneNotSupportedException.
