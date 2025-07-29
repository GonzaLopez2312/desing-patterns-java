package com.packages.Adapter;

public class Football11Tournament {

    private int sizeRequired;

    public Football11Tournament(int sizeRequired) {
        this.sizeRequired = sizeRequired;
    }

    public void availableToPlay(Football11Team football11Team){
        System.out.println();
        boolean flag = this.sizeRequired <= football11Team.getSizeTitularTeam();
        if (flag){
            System.out.println("---- The team '" + football11Team.getTeamName() + "' is available to play the tournament. ----");
        }else{
            System.out.println("---- The team '" + football11Team.getTeamName() + "' is not available to play the tournament. ----");
        }

    }
}
