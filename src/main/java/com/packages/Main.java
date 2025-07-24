package com.packages;

import com.packages.Memento.Caretaker;
import com.packages.Memento.Game;
import com.packages.Memento.Originator;

public class Main {
    public static void main(String[] args) {

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



    }
}