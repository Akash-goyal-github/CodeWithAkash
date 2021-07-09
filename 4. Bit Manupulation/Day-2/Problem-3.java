/**
 * @author AkashGoyal
 */

/**


--------------------- Problem----------->>   Find position of the only set bit

    Problem Link :- https://practice.geeksforgeeks.org/problems/find-position-of-set-bit3706/1

  */

    class Solution {
      static int findPosition(int n) {
          // code here
          
          if(n!=0 && (n & (n-1))==0)
          {
              return (int)(Math.log(n)/Math.log(2))+1;
          }
          else
          {
              return -1;
          }
      }
    };
