/**
 * @author AkashGoyal
 */

/**


--------------------- Problem----------->>  square root of an integer

    Problem Link :- https://practice.geeksforgeeks.org/problems/count-squares3649/1

  */


  class Solution {
    static int countSquares(int N) {
        // code here
        int count=0;
        for(int i=1;i<Math.sqrt(N);i++)
        {
            count++;
        }
        
        return count;
    }
};