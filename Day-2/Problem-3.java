/**
 * @author AkashGoyal
 * @date 24/05/2021
 */

/**


--------------------- Problem----------->> Kadane's Algorithm

    Problem Link :- https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1



  */

  class Solution{
    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int arr[], int n){
        
        // Your code here
        int global=arr[0];
        int local=arr[0];
        for(int i=1;i<n;i++)
        {
            if(local+arr[i]>arr[i])
            {
                local=local+arr[i];
            }
            else
            {
                local=arr[i];
            }
            
            if(global<local)
            {
                global=local;
            }
        }
        
        return global;
        
    }
}