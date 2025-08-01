## *Observer Pattern*

The Observer pattern is used when you have a subject that might change its state, and many listeners that depend on that
subject state. The pattern indicates how to notify all the listeners in an efficient way. Listeners don't have
to continuously ask the subject, nor does the subject notify listeners that do not care about its new state. 

The solution is to have a list of observers, where you can add or delete them according to their needs. And every time 
the state changes, the subject, or observable, notifies all its listeners.

In this example, the refinery sells fuel to many stations. These stations need to know the fuel purchase price, in order
to update their own sale price. When a station stops buying fuel from the refinery, it unsubscribes from the refinery.
