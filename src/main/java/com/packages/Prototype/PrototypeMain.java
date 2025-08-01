package com.packages.Prototype;

public class PrototypeMain {

    public static void main(String[] args) {

        System.out.println("\n ------ PROTOTYPE ------ \n");

        Cell plantCell = new Cell(true, 2);
        Cell clonePlantCell = (Cell) plantCell.clonation();

        if (clonePlantCell == null){
            System.out.println("Plant cell is null");
        }

        System.out.println("First Cell: " + plantCell.toString());
        System.out.println("-------------------------------------------------");
        System.out.println("Cloned Cell: " + clonePlantCell.toString());
        System.out.println("-------------------------------------------------");
        System.out.println("Are the both cell the same? " + clonePlantCell.equals(plantCell));


    }
}
