package com.packages.Observer;

public class YPFStationObserver implements Observer {

    private double fuelSalePrice;
    public YPFStationObserver(double fuelSalePrice) {
        this.fuelSalePrice = fuelSalePrice;
    }

    public void update(double fuelPurchasePrice) {
        fuelSalePrice = fuelPurchasePrice * 1.5;
        System.out.println("YPF Station, new fuel sale price: '" + fuelSalePrice + "'");
    }
}
