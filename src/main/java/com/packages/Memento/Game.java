package com.packages.Memento;

public class Game {

    private String gameLevel;
    private double caracterHealth;
    private int caracterLevel;

    public Game(String gameLevel, double caracterHealth, int caracterLevel) {
        this.gameLevel = gameLevel;
        this.caracterHealth = caracterHealth;
        this.caracterLevel = caracterLevel;
    }

    public String getGameLevel() {
        return gameLevel;
    }
    public double getCaracterHealth() {
        return caracterHealth;
    }
    public int getCaracterLevel() {
        return caracterLevel;
    }

    public void printGame() {
        System.out.println("Game level: '" + gameLevel +"'. Health: '" + caracterHealth +"'. Level: '" + caracterLevel +"'.");
    }
}
