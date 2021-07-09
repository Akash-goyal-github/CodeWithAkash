/**
 * @author AkashGoyal
 */

/**


--------------------- Problem----------->>  Count set bits in an integer

    Problem Link :- https://practice.geeksforgeeks.org/problems/set-bits0143/1

    Reference Link:- https://www.youtube.com/watch?v=I475waWiTK4

            Extra:-
            https://www.youtube.com/watch?v=KJnhAUkxAho
    

  */

//Method-1 


  class Solution {
    static int setBits(int n) {
        // code here
        int count=0;
        while(n>0)
        {
            int p=(int)Math.floor(Math.log(n)/Math.log(2));
            n=n-(int)Math.pow(2,p);
            count++;
        }
        return count;
    }
}

// ----------------------------------------------------------------------------------------------------


//Method-2

class Solution {
    static int setBits(int n) {
        // code here
        int count=0;
        while(n>0)
        {
            n=n&(n-1);
            count++;
        }
        return count;
    }
}

// ----------------------------------------------------------------------------------------------------

//Method:-3 

class Solution {
    static int setBits(int n) {
        
        // https://www.youtube.com/watch?v=I475waWiTK4
        // code here
        int count=0;
        while(n>0)
        {
            int rmsb=n & (-n);
            n=n-rmsb;
            
            count++;
        }
        return count;
    }
}