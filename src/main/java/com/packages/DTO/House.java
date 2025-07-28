package com.packages.DTO;

public class House {

    private Long id;
    private String address;
    private String city;
    private String state;
    private int coveredArea;
    private int floors;

    public House(String address, String city, String state, int coveredArea, int floors) {
        this.address = address;
        this.city = city;
        this.state = state;
        this.coveredArea = coveredArea;
        this.floors = floors;
    }
}
