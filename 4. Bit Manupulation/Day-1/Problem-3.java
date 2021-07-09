/**
 * @author AkashGoyal
 */

/**


--------------------- Problem----------->>  Count number of bits to be flipped to convert A to B

    Problem Link :- https://practice.geeksforgeeks.org/problems/bit-difference/0

    Reference:- https://www.youtube.com/watch?v=YvYGhJjQPTI

  */


  //Method:-1


class Solution{
    
    // Function to find number of bits needed to be flipped to convert A to B
    public static int countBitsFlip(int a, int b){
        
        // Your code here
        
        int flip= a^b;
        int count=0;
        
        while(flip>0)
        {
            int rmsb=flip&(-flip);
            flip=flip-rmsb;
            count++;
        }
        return count;
        
    }
    
    
}


// --------------------------------------------------------------------------------------------------------------------

// Method:-2


class Solution{
    
    // Function to find number of bits needed to be flipped to convert A to B
    public static int countBitsFlip(int a, int b){
        
        // Your code here
        
        int flip= a^b;
        int count=0;
        
        while(flip>0)
        {
            int rmsb=flip&(-flip);
            flip=flip-rmsb;
            count++;
        }
        return count;
        
    }
}


