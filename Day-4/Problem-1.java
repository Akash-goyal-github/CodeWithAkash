/**
 * @author AkashGoyal
 * @date 27/05/2021
 */

/**


--------------------- Problem----------->> Find the Duplicate Number

    Problem Link :- https://leetcode.com/problems/find-the-duplicate-number/

  */

class Solution {
    
    public int findDuplicate(int[] nums) {
        
// s(start index)  ->d(loop start)  ->c(colide) ->d(loop start)
//                 x               y           z=x

// sped f = 2 * speed s

// x + y+z+y = 2(x+y)
// x+y+z+y = x + x +y+ +y
//  z= x
        
        
        //start with same index
        int slow=nums[0];
        int fast=nums[0];
        
        //move one point ahead
        slow=nums[slow];
        
        //move two point ahead
        fast=nums[nums[fast]];
        
        
        //detecting cycle
        
        while(fast!=slow)
        {
            fast=nums[nums[fast]];
            slow=nums[slow];
        }
        
        // putting slow at start
        slow=nums[0];
        
        //wherever they colide return that element
        while(fast!=slow)
        {
            fast=nums[fast];
            slow=nums[slow];
        }
        
        return slow;

    }
}