package com.packages.Facade;

public class FacadeMain {

    public static void main(String[] args) {

        System.out.println("\n ------ FACADE ------ \n");

        OrderFacade orderFacade = new OrderFacade();
        orderFacade.placeOrder("River Plate T-Shirt", 500, "09122018");
    }
}
