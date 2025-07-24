The Memento Pattern is a good alternative when the objective is to save the states of an object and retrieve them later. The 
pattern helps prevent the violation of encapsulation, since the only class that knows the internal format of the 
object is the object itself. The rest of classes only handle its object saved versions: they either store them or return
them to the originator.

By using the Caretaker class, you can access multiple states of the originator object, making it possible to restore,
in this example several saved games. 

For this example, you can execute the following code:

Game game = new Game("Level 1", 500.5, 2);  
Originator originator = new Originator(game);  
Caretaker caretaker = new Caretaker();  

game.printGame();  
caretaker.addMemento(originator.saveGame());  

game = new Game("Level 2", 100.5, 5);  
originator.setState(game);  
caretaker.addMemento(originator.saveGame());  
game.printGame();  

game = new Game("Level 3", 200.0, 6);  
game.printGame();  

originator.restoreGame(caretaker.getMemento(1));  
game = originator.getState();  
game.printGame();  
game = new Game("Level 3", 50, 7);  
originator.setState(game);  
game.printGame();  

game = new Game("Level 4", 200.5, 8);  
  
game = new Game("Level 5", 600.5, 10);  
originator.setState(game);  
caretaker.addMemento(originator.saveGame());  
game.printGame();  

And you will see the following output in console:  

Game level: 'Level 1'. Health: '500.5'. Level: '2'.
Game level: 'Level 2'. Health: '100.5'. Level: '5'.
Game level: 'Level 3'. Health: '200.0'. Level: '6'.
Game level: 'Level 2'. Health: '100.5'. Level: '5'.
Game level: 'Level 3'. Health: '50.0'. Level: '7'.
Game level: 'Level 5'. Health: '600.5'. Level: '10'.

The example shows that you can go back to the game saved in Level 2, and continue playing from that point.