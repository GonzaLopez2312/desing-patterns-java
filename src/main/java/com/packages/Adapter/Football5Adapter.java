package com.packages.Adapter;

public class Football5Adapter extends Football11Team {

    private Football5Team football5Team;

    public Football5Adapter(Football5Team football5Team) {
        this.football5Team = football5Team;
    }

    @Override
    public int getSizeTitularTeam(){
        return football5Team.getSizeTitularTeam() + football5Team.getSizeSubstituteTeam();
    }

    @Override
    public String getTeamName(){
        return football5Team.getTeamName();
    }
}
