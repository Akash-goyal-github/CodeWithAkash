/**
 * @author AkashGoyal
 */

/**


--------------------- Problem----------->>  Search in Rotated Sorted Array

    Problem Link :- https://leetcode.com/problems/search-in-rotated-sorted-array/


    Reference:- https://www.youtube.com/watch?v=r3pMQ8-Ad5ss

  */

  class Solution {
    public int search(int[] nums, int target) {
        return BinSearch(nums,0,nums.length-1,target);
        
    }
    
    int BinSearch(int nums[],int left, int right,int target)
    {
        int mid=0;
        
        while(left<=right)
        {
            mid=left+(right-left)/2;
            //sorted
            
            if(nums[mid]==target)
            {
                return mid;
            }
            
            // check if left side is sorted
            if(nums[mid]>=nums[left])
                {
                //figure out if your element lies in left side or not
                    if(nums[left]<=target && target<=nums[mid])
                    {
                        right=mid-1;
                    }
                    else
                    {
                        left=mid+1;
                    }

                }
            //// else check if right side is sorted
            else
                {
                 //figure out if your element lies in right side or not
                    if(nums[mid]<=target && target<=nums[right])
                    {
                        left=mid+1;
                    }
                    else
                    {
                        right=mid-1;
                    }
                }
        }
        
        return -1;
    }
}