/**
 * @author AkashGoyal
 */

/**


--------------------- Problem----------->>   Copy set bits in a range

    Problem Link :- https://practice.geeksforgeeks.org/problems/copy-set-bits-in-range0623/1
    
  */


class Solution{
    static int setSetBit(int x, int y, int l, int r){
        // code here
        
        /*
        
        Example:-
        
                   r  l
        x=> 00101011001
        y=>        1111
        
        -> we want to get all the bits as it is between l and r and rest other 0;
            so we will make a mask;
        int mask--> take mask as 1;
                    shift mask with (right-left+1);
                    now subtract 1;
                    so we will have right-left 1's
                    now we will shift them (left-1) so that they can come below our changing area
                    
        now if we do & then we will get mask of the number
        
        mask | x will give output
        
        */
        
        if (l < 1 || r > 32)
        return -1;
        
        int mask=1<<(r-l+1);
        mask--;
        
        // 1<<32 is 1. so we won't get it if they have given use range of 32 bits
        // 1<<32 is 1 how?
                 // if we see this then we can shift 31 bit to reach to the left most bit
                 //  if we do left shift one more timr then it will come at starting and become 1(00000..1)
        //use 
        //100000-000001--> 011111(this should return because it will be the max output)
        
        if(r-l+1==32)
        {
            mask=(1<<31)-1;
        }
        mask=mask<<(l-1);
        
        mask=y&mask;
        
        x=mask|x;
        
        return x;
        
    }
} 