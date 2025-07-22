package com.packages.Facade;

public class InventoryService {

    public boolean isAvailable(String productName) {
        System.out.println("Checking product availability...");
        //here should be some logic that checks if it is actually available
        return true;
    }
}
