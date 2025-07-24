package com.packages.Observer;

public class ShellStationObserver implements Observer {

    private double fuelSalePrice;
    public ShellStationObserver(double fuelSalePrice) {
        this.fuelSalePrice = fuelSalePrice;
    }

    public void update(double fuelPurchasePrice) {
        fuelSalePrice = fuelPurchasePrice * 1.9;
        System.out.println("Shell Station, new fuel sale price: '" + fuelSalePrice + "'");
    }
}
