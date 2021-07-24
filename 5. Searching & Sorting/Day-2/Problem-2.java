/**
 * @author AkashGoyal
 */

/**


--------------------- Problem----------->>   Maximum and minimum of an array using minimum number of comparisons

    Problem Link :- https://practice.geeksforgeeks.org/problems/middle-of-three2926/1

     
  */


//  Method-1

class Solution{
    int middle(int A, int B, int C){
        //code here
        
        int max= Math.max(Math.max(A,B),Math.max(B,C));
        int min= Math.min(Math.min(A,B),Math.min(B,C));
        
        return A+B+C-max-min;
    }
}


// ------------------------------------------------------------------------


// Method-2


class Solution{
    int middle(int A, int B, int C){
        //code here
        
        //first find minimum and max of these numbers
        //using XOR to solve this
        
       /* why XOR?
        
            there are three elements (we have already got minimum and maximum number)
            so only one number that is mid is left.
            
        --> we know that if we take xor of same value that it becomes 0.
        
            so when we do max^min^A^B^C==> then actually two values from a and b are the same as max and min
            
            then what is left---> 0^(mid_value)==> mid_value ==> answer:)
            */
            
             
        int max= Math.max(Math.max(A,B),Math.max(B,C));
        int min= Math.min(Math.min(A,B),Math.min(B,C));
        
        return max^min^A^B^C;
    }
}


// ------------------------------------------------------------------------


// Method-3


class Solution{
    int middle(int A, int B, int C){
        //code here
        
        //by only two comparisions
        
        int x=A-B;
        int y=B-C;
        int z=C-A;
        
        //C>B>A
        if(x*y>0)
        {
            return B;
        }
        //B>C>A
        if(z*y>0)
        {
            return C;
        }
        
        return A;
    }
}



// ------------------------------------------------------------------------


// Method-4



class Solution{
    int middle(int A, int B, int C){
        //code here
        if(A>B)
        {
            if(B>C)
            {
                return B;
            }
            else
            {
                if(A>C)
                {
                    return C;
                }
                else
                {
                    return A;
                }
            }
        }
        else
        {
            if(B>C)
            {
                if(A>C)
                {
                    return A;
                }
                else
                {
                    return C;
                }
            }
            else
            {
                return B;
            }
        }
        
    }
}