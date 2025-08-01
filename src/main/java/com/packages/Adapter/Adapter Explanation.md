## *Adapter Pattern*

The Adapter Pattern helps us in to make objects with incompatible interfaces collaborate. This is possible thanks to the 
Adapter class, which wraps the incompatible class and implements the required interface. In this way, the
Adapter allows the class to work with the interface it couldn’t originally support.

Some important points to mention, are first that the original class remains unchanged. The Adapter acts as a wrapper that exposes
the expected interface to the client. And second, that there are different ways to implement the Adapter pattern. It 
can be implemented using composition (object adapter) or inheritance (class adapter), depending on the language and requirements.

In the proposed example, we have a football tournament, and teams from football 11 and football 5. Depending on the team 
that is trying to sign up for the tournament, the team size is retrieved through the Adapter. The Adapter pattern was
implemented through inheritance.
