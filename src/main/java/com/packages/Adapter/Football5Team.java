package com.packages.Adapter;

public class Football5Team {

    private String teamName;
    private int sizeTitularTeam;
    private int sizeSubstituteTeam;

    public Football5Team(String teamName, int sizeTitularTeam, int sizeSubstituteTeam) {
        this.teamName = teamName;
        this.sizeTitularTeam = sizeTitularTeam;
        this.sizeSubstituteTeam = sizeSubstituteTeam;
    }

    public int getSizeTitularTeam() {
        return sizeTitularTeam;
    }
    public int getSizeSubstituteTeam() {
        return sizeSubstituteTeam;
    }
    public String getTeamName() {
        return teamName;
    }
}
