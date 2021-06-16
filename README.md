# local-min-java
LocalMin.java takes the two dimensional integer array as user input  and displays the local minimums


Given an N-by-N array a[ ][_] of N2 distinct integers, design a non-recursive algorithm to find all local 
minimums with pair of indices i and j such that 

a[ i ][ j ] < a[ i+1 ][ j ], 
a[ i ][ j ] < a[ i ][ j+1 ], 
a[ i ][ j ] < a[ i-1 ][ j ], and 
a[ i ][ j ] < a[ i ][ j-1 ].

Implement your algorithm using Java which takes the two dimensional integer array as user input
and displays the correct output 

Test case: 
 Input: 
 
[[26 27 58 38]
[33 53 70 42] 
[5 33 2 66]
[65 55 70 44]]

 Output: 
26, 38, 44, 5, 2 (Can be printed in any order)
