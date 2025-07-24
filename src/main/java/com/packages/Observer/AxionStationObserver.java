package com.packages.Observer;

public class AxionStationObserver implements Observer{

    private double fuelSalePrice;
    public AxionStationObserver(double fuelSalePrice) {
        this.fuelSalePrice = fuelSalePrice;
    }

    public void update(double fuelPurchasePrice) {
        fuelSalePrice = fuelPurchasePrice * 1.6;
        System.out.println("Axion Station, new fuel sale price: '" + fuelSalePrice + "'");
    }
}
