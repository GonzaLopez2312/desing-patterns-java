## *DAO Pattern*

The DAO Pattern stands for Data Access Object. This pattern is used to encapsulate access to the database. The idea is 
to separate the business logic from the database access into separate classes. Following this pattern, if there's a change
in the database engine, the business logic won't be affected, and the only change that will be necessary is how to access
the new engine, by implementing the DAO Interface which already contains all the methods used in the business layer.

In Spring based applications, it's common to see the DAO pattern applied through repository interfaces that extend 
JpaRepository, which encapsulate data access logic while keeping the business logic in separate service layers. 

The example below is meant to illustrate how to build the structure needed to use Dao Pattern, and on the other hand, how it 
might be without using the pattern. The use of the DAO can be seen in 'BookServiceWithDAO' class, while in 
'BookServiceWithoutDAO' it can be seen how it would be without DAO pattern, and the implications that it entails.