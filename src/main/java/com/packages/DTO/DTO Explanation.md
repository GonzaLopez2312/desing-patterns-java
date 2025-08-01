## *DTO Pattern*

The DTO Pattern stands for Data Transfer Object. As its name indicates, it is used to transfer data of objects, between
different layers of the software, or even through HTTP. The pattern is useful due to it allows the creation of
new objects with only the attributes that are needed, avoiding the transfer of unnecessary data. Another reason to 
use this pattern, is to create more complex objects that may combine attributes from different objects, or include some
that are calculated within the system's logic.

It may look like DAO pattern, but the main difference is in the name of each pattern. DTO is for transferring data, while
DAO is for accessing data.