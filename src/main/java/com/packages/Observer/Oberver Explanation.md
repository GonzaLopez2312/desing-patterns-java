The Observer pattern is used when you have a subject that might change its state, and many listeners that depend on that
subject state. The pattern indicates how to notify all the listeners in an efficient way. Listeners don't have
to continuously ask the subject, nor does the subject notify listeners that do not care about its new state. 

The solution is to have a list of observers, where you can add or delete them according to their needs. And every time 
the state changes, the subject, or observable, notifies all its listeners.

In this example, the refinery sells fuel to many stations. These stations need to know the fuel purchase price, in order
to update their own sale price. When a station stops buying fuel from the refinery, it unsubscribes from the refinery.

If you execute the following code:

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

You will see the following output in console:

----- YPF REFINERY, Fuel Price UPDATED: 1200.0----
Shell Station, new fuel sale price: '2280.0'
YPF Station, new fuel sale price: '1800.0'
Axion Station, new fuel sale price: '1920.0'
----- YPF REFINERY, Fuel Price UPDATED: 1150.0----
YPF Station, new fuel sale price: '1725.0'
Axion Station, new fuel sale price: '1840.0'