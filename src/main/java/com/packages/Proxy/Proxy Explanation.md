## *Proxy Pattern*

The Proxy Pattern is very valuable when you have to add behavior to a class that you can't modify. The solution provided
by this pattern, is to make the client interact with the proxy class, instead of the original class. The proxy 
class will call the requiered methods from the original class, but it will add some behavior before, or after its execution.

One aspect to keep in mind, is that the proxy acts as a transparent intermediary for the client. The client doesn't need 
to know whether it's dealing with the real object or the proxy.

Some reasons why you might not be able to modify a class, are that it could be from an external library, or it might already 
be too complex, and adding more behavior would make it even more complicated.

The console prints and logs use different mechanisms to output text, which is why they aren't interleaved.
However, the logs demonstrate the additional behavior that we added in the ProxyAccount class.