package com.packages.Observer;

public class ObserverMain {
    public static void main(String[] args) {

        System.out.println("\n ------ OBSERVER ------ \n");

        YPFRefineryObservable ypfRefineryObservable = new YPFRefineryObservable(1000);
        ShellStationObserver shellStationObserver = new ShellStationObserver(1000);
        YPFStationObserver ypfStationObserver = new YPFStationObserver(1000);
        AxionStationObserver axionStationObserver = new AxionStationObserver(1000);

        ypfRefineryObservable.subscribe(shellStationObserver);
        ypfRefineryObservable.subscribe(ypfStationObserver);
        ypfRefineryObservable.subscribe(axionStationObserver);

        ypfRefineryObservable.updateFuelPrice(1200);

        ypfRefineryObservable.unsubscribe(shellStationObserver);

        ypfRefineryObservable.updateFuelPrice(1150);
    }
}
