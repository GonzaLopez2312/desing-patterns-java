package com.packages.Memento;

public class Originator {

    private Game state;

    public Originator(Game state) {
        this.state = state;
    }

    public Game getState() {
        return state;
    }

    public void setState(Game state) {
        this.state = state;
    }

    public Memento saveGame(){
        return new Memento(state);
    }

    public void restoreGame(Memento memento){
        this.state = memento.getState();
    }
}
