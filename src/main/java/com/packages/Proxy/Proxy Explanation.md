The Proxy Pattern is very valuable when you have to add behavior to a class that you can't modify. The solution provided
by this pattern, is to make the client interact with the proxy class, instead of the original class. The proxy 
class will call the requiered methods from the original class, but it will add some behavior before, or after its execution.

One aspect to keep in mind, is that the proxy acts as a transparent intermediary for the client. The client doesn't need 
to know whether it's dealing with the real object or the proxy.

Some reasons why you might not be able to modify a class, are that it could be from an external library, or it might already 
be too complex, and adding more behavior would make it even more complicated.

If we execute the following code:  
Account account = new Account(1L, "Gonzalo Lopez", 1000.0);  
BankAccount proxy = new ProxyAccount();  
proxy.depositMoney(account, 500.0);  
proxy.withdrawMoney(account, 300.0);  
proxy.showBalance(account);  

We will see the following in the console:  
jul 22, 2025 7:03:35 P. M. com.packages.Proxy.ProxyAccount depositMoney  
INFORMACIÓN: ------Depositing 500.0 in the account of user: 'Gonzalo Lopez'------  
jul 22, 2025 7:03:35 P. M. com.packages.Proxy.ProxyAccount withdrawMoney  
INFORMACIÓN: ------Withdrawing 300.0 from account of user: 'Gonzalo Lopez'------  
jul 22, 2025 7:03:35 P. M. com.packages.Proxy.ProxyAccount showBalance  
INFORMACIÓN: ------Showing balance of user: 'Gonzalo Lopez'------  
Current balance: '1500.0'  
Current balance: '1200.0'  
Current balance: '1200.0'  

The console prints and logs use different mechanisms to output text, which is why they aren't interleaved.
However, the logs demonstrate the additional behavior that we added in the ProxyAccount class.