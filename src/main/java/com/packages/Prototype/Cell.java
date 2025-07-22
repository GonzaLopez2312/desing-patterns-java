package com.packages.Prototype;

public class Cell implements Prototype {

    private boolean hasChloroplasts;
    private int age;

    public Cell(boolean hasChloroplasts, int age) {
        this.hasChloroplasts = hasChloroplasts;
        this.age = age;
    }

    public Prototype clonation() {
        Cell newCell = null;
        try{
            newCell = (Cell) clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return newCell;
    }

    @Override
    public String toString() {
        return "Cell: has chloroplasts: '" + hasChloroplasts + "', age: '" + age + "'";
    }
}
