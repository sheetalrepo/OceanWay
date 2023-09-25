#Sorting Algos:

#For interviews:
coding practice for Bubble, selection etc
algo for all specially Quick, Merge, Heap Sort


#Ranking of Algos (http://bigocheatsheet.com/)
Cond: If array length is long and space is limited + element value is large 
HeapSort is best than MergeSort
In general Quick and Merge Sort used most

Cond: If array elements values are smaller e.g. 0 to 999 numbers to be sorted  + array length can be small or large
Counting/Radix Sort is best bet
For big digits elements counting/radix algo are very bad as it create a array space in 
memory depending upon max value present in array


counting/radix sort | [1,5,2,7,10]     |   short array with low element  | space O(k)
counting/radix sort | [1,1,1,5,4,4,4,4,6,6,6,6,5,2,8,8,..........n]   | long array but low value elements 
heap sort           | [800,600,1000,400,9000]    |   short array with high value element  |  space O(1) 
heap sort           | [1600,600,1000,............................n]   | long array but high value elements




#Basic information:
1. Binary Tree : A Tree structure where there is one root (top element) and max two children i.e. left & right; 
   one children is allowed called leaves
   
2. Binary Heap : Binary heap is a binary tree such that every node is greater/smaller than its children
	max heap : nodes is greater than its children    
    min heap : nodes is smaller than its children
   Binary Heap can be easily represented in Array form which gives space advantage of array
   
   