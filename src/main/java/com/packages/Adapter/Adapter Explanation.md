The Adapter Pattern helps us in to make objects with incompatible interfaces collaborate. This is possible thanks to the 
Adapter class, which wraps the incompatible class and implements the required interface. In this way, the
Adapter allows the class to work with the interface it couldn’t originally support.

Some important points to mention, are first that the original class remains unchanged. The Adapter acts as a wrapper that exposes
the expected interface to the client. And second, that there are different ways to implement the Adapter pattern. It 
can be implemented using composition (object adapter) or inheritance (class adapter), depending on the language and requirements.

In the proposed example, we have a football tournament, and teams from football 11 and football 5. Depending on the team 
that is trying to sign up for the tournament, the team size is retrieved through the Adapter. The Adapter pattern was
implemented through inheritance.

Running the following code:  

Football11Team football11Team = new Football11Team("River Plate", 11);  
Football11Tournament football11Tournament = new Football11Tournament(11);  
football11Tournament.availableToPlay(football11Team);  

Football5Team littleFootball5Team = new Football5Team("voka juni", 5, 3);  
Football5Adapter littleFutbol5Adapter = new Football5Adapter(littleFootball5Team);  
football11Tournament.availableToPlay(littleFutbol5Adapter);  

Football5Team bigFootball5Team = new Football5Team("Big Team", 5, 8);  
Football5Adapter bigFutbol5Adapter = new Football5Adapter(bigFootball5Team);  
football11Tournament.availableToPlay(bigFutbol5Adapter);  

The next output will be produced in the console:  

---- The team 'River Plate' is available to play the tournament. ----

---- The team 'voka juni' is not available to play the tournament. ----  

---- The team 'Big Team' is available to play the tournament. ----  