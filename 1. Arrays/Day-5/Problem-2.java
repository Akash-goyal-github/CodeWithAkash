/**
 * @author AkashGoyal
 * @date 28/05/2021
 */

/**


--------------------- Problem----------->> Next Permutation

    Problem Link :- https://leetcode.com/problems/next-permutation/


    Reference:- https://www.youtube.com/watch?v=LuLCLgMElus
  */

  class Solution {
    public void nextPermutation(int[] nums) {
       
        /*
        
        first find the decrement index from back exa:-(1,3,5,4,2)--> 3(lesser then the previous value from last)
        */
        
        int index=-1;
        int n=nums.length;
        for(int i=nums.length-1;i>0;i--)
        {
            if(nums[i]>nums[i-1])
            {
                index=i-1;
                break;
            }
        }
        
        //if we found the index then swap that element with the bigger one from last.
        
        if(index!=-1)
        {
            for(int i=n-1;i>0;i--)
            {
                if(nums[i]>nums[index])
                {
                    //swap
                    
                    int temp=nums[index];
                    nums[index]=nums[i];
                    nums[i]=temp;
                    break;
                }
            }
        }
        
        //we will reverse the right side array of the index. so that we will minimize it.
        
       index++;//going to right of index and reversing
        
        int last=n-1;
        while(index<last)
        {
            
            int temp=nums[index];
            nums[index]=nums[last];
            nums[last]=temp;
            index++;
            last--;
        }
            
        
    }
}