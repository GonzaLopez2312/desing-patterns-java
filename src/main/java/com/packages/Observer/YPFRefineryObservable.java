package com.packages.Observer;

import java.util.ArrayList;
import java.util.List;

public class YPFRefineryObservable implements Observable {

    private double fuelPrice;
    private List<Observer> observers = new ArrayList<Observer>();

    public YPFRefineryObservable(double fuelPrice) {
        this.fuelPrice = fuelPrice;
    }

    public void updateFuelPrice(double fuelPrice) {
        this.fuelPrice = fuelPrice;
        System.out.println("----- YPF REFINERY, Fuel Price UPDATED: " + fuelPrice + "----");
        notifyObservers(fuelPrice);
    }

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(double fuelPrice) {
        for (Observer observer : observers) {
            observer.update(fuelPrice);
        }
    }
}
