Problem Stmt:
- we have some data in Map or excel with some primary/unique key
- we want to fetch/utilize complete data in best possible way

Sol 1: We can read excel data row by row and use it on UI. 
	But it will degrade performance as read excel for every row is bad idea.
     
Sol 2: We can read complete excel and store it into a Big HashMap. 
	Later Map can be iterated and value can be utilized.
	Sol 2 is also ok.

Sol 3: Best Java obj approach would be to convert every row into Java object, using POJOs of excel columns 
	And create a Map of Java objects with Key as primary key
     