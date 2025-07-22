The Prototype pattern is used when creating an instance from scratches is laborious. Here we use the clone () method from 
the Cloneable Interface, and cast the result to the requiered class.

To use this pattern, we have to make the class that we may clone, implement Cloneable, and define the clone() method in a 
try catch block. In case the cloning fails, the method will throw a CloneNotSupportedException.

The next codes is a test of the pattern.

Cell plantCell = new Cell(true, 2);  
Cell clonePlantCell = (Cell) plantCell.clonation();

if (clonePlantCell == null){  
    System.out.println("Plant cell is null");  
}

System.out.println("First Cell: " + plantCell.toString());  
System.out.println("-------------------------------------------------");  
System.out.println("Cloned Cell: " + clonePlantCell.toString());  
System.out.println("-------------------------------------------------");  
System.out.println("Are the both cell the same? " + clonePlantCell.equals(plantCell));  

Gives me the next exit in console    
First Cell: Cell: has chloroplasts: 'true', age: '2'  
-------------------------------------------------  

Cloned Cell: Cell: has chloroplasts: 'true', age: '2'

-------------------------------------------------  
Are the both cell the same? false  