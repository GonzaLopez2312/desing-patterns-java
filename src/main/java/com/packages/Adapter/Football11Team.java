package com.packages.Adapter;

public class Football11Team {

    private String teamName;
    private int sizeTitularTeam;

    public Football11Team(){}

    public Football11Team(String teamName, int sizeTitularTeam) {
        this.teamName = teamName;
        this.sizeTitularTeam = sizeTitularTeam;
    }

    public int getSizeTitularTeam() {
        return sizeTitularTeam;
    }
    public String getTeamName() {
        return teamName;
    }
}
