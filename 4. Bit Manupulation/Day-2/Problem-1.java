/**
 * @author AkashGoyal
 */

/**


--------------------- Problem----------->>   Count total set bits in all numbers from 1 to n

    Problem Link :- https://practice.geeksforgeeks.org/problems/count-total-set-bits/0

    Reference:- https://www.youtube.com/watch?v=g6OxU-hRGtY
    
  */



  class Solution{
    
    //Function to return sum of count of set bits in the integers from 1 to n.
    
     /*   
    -----------------------------------------------------------------------------------
    
    Example:-1 
    
        n=11;
    
    // Your code here
        0-> 0000
        1-> 0001
        2-> 0010
        3-> 0011
        4-> 0100
        5-> 0101
        6-> 0110
        7-> 0111
            |  |
             -3- 
             
        x => highest power of 2 less then 11
        
        Till here count ==> 2^(x-1)*x
        ---------------------------------------------  
        8-> 1000
        9-> 1001
        10->1010
        11->1011
        
        //Take msb 1 out we will have--> n-(2^x)+1;
        
        now after counting all msb 1's
        
        left -->
        
        8-> 000-> 0
        9-> 001-> 1
        10->010-> 2
        11->011-> 3
        
        On observing we see that again we got (0-> z) natural numbers to count
        
        where z=> n-(2^x);
        
        --> apply recursion on z;
        
======>>>> Output-> 2^(x-1)*x + n-(2^x)+1 + countSetBits(n-(2^x));
    
    -----------------------------------------------------------------------------------
     
     */   
     
    public static int countSetBits(int n){
        
        if(n==0)
        {
            return 0;
        }
    
        int x=(int)((Math.log(n))/(Math.log(2)));
        
        int totalcounttillmaxpower2=x*(1<<(x-1));
        
        int msbaftermaxpower2= n-(1<<x)+1;
        
        int remainingcount= n-(1<<x);
        
        return totalcounttillmaxpower2+msbaftermaxpower2+ countSetBits(remainingcount);
    }
}