## *Memento Pattern*

The Memento Pattern is a good alternative when the objective is to save the states of an object and retrieve them later. The 
pattern helps prevent the violation of encapsulation, since the only class that knows the internal format of the 
object is the object itself. The rest of classes only handle its object saved versions: they either store them or return
them to the originator.

By using the Caretaker class, you can access multiple states of the originator object, making it possible to restore,
in this example several saved games.

The example shows that you can go back to the game saved in Level 2, and continue playing from that point.