package com.packages;


import com.packages.Adapter.Football11Team;
import com.packages.Adapter.Football11Tournament;
import com.packages.Adapter.Football5Adapter;
import com.packages.Adapter.Football5Team;

public class Main {
    public static void main(String[] args) {

        Football11Team football11Team = new Football11Team("River Plate", 11);
        Football11Tournament football11Tournament = new Football11Tournament(11);
        football11Tournament.availableToPlay(football11Team);

        Football5Team littleFootball5Team = new Football5Team("voka juni", 5, 3);
        Football5Adapter littleFutbol5Adapter = new Football5Adapter(littleFootball5Team);
        football11Tournament.availableToPlay(littleFutbol5Adapter);

        Football5Team bigFootball5Team = new Football5Team("Big Team", 5, 8);
        Football5Adapter bigFutbol5Adapter = new Football5Adapter(bigFootball5Team);
        football11Tournament.availableToPlay(bigFutbol5Adapter);
    }
}