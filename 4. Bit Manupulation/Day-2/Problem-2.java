/**
 * @author AkashGoyal
 */

/**


--------------------- Problem----------->>   Power of 2

    Problem Link :- https://practice.geeksforgeeks.org/problems/power-of-2-1587115620/1

                
        Method-1 --> We can Use log(n) base 2 if it is integer then return divisible by 2
                
        
            --------------------------------------------------------------------------------------------------------------

        Method-2 --> All power of two numbers has only a one-bit set. So count the no. of set bits and if you get 1 then the number is a power of 2. Please see Count set bits in an integer for counting set bits.
                If we subtract a power of 2 numbers by 1 then all unset bits after the only set bit become set; and the set bit becomes unset.
                For example for 4 ( 100) and 16(10000), we get the following after subtracting 1 
                3 –> 011 
                15 –> 01111

                So, if a number n is a power of 2 then bitwise & of n and n-1 will be zero. We can say n is a power of 2 or not based on the value of n&(n-1). The expression n&(n-1) will not work when n is 0. 
                To handle this case also, our expression will become [n!=0 && ((n&(n-1)) == 0)

  */

class Solution{
    
    // Function to check if given number n is a power of two.
    
                /*  
        Explanation:-   All power of two numbers has only a one-bit set. So count the no. of set bits and if you get 1 then the number is a power of 2. 
                        Please see Count set bits in an integer for counting set bits.
                        If we subtract a power of 2 numbers by 1 then all unset bits after the only set bit become set; and the set bit becomes unset.
                        For example for 4 ( 100) and 16(10000), we get the following after subtracting 1 
                        3 –> 011 
                        15 –> 01111
                        
                        So, if a number n is a power of 2 then bitwise & of n and n-1 will be zero. We can say n is a power of 2 or not based on the 
                        value of n&(n-1). The expression n&(n-1) will not work when n is 0. To handle this case also, our expression will become 
                        [n!=0 && ((n&(n-1)) == 0)
        */
    public static boolean isPowerofTwo(long n){
        
        // Your code here
        
        return (n!=0 && (n & (n-1))==0);
    }
    
}
