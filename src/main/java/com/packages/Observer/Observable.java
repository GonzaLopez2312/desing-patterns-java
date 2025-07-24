package com.packages.Observer;

import java.util.ArrayList;
import java.util.List;

public interface Observable {


    public void subscribe(Observer observer);

    public void unsubscribe(Observer observer);

    public void notifyObservers(double fuelPrice);
}
