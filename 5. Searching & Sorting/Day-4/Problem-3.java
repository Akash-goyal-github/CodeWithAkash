/**
 * @author AkashGoyal
 */

/**


--------------------- Problem----------->>   Stickler Thief (maximum sum such that no 2 elements are adjacent)

    Problem Link :- https://practice.geeksforgeeks.org/problems/stickler-theif-1587115621/1

  */




class Solution
{
    //Function to find the maximum money the thief can get.
    
    int dp_arr[]=new int[10000];
    public int FindMaxSum(int arr[], int n)
    {
        // Your code here
        
        for(int i=0;i<10000;i++)
        {
            dp_arr[i]=-1;
        }
        return Math.max(dp_max(arr,n-1),dp_max(arr,n-2));
    }
    
    int dp_max(int arr[],int n)
    {
        if(n<0)
        {
            return 0;
        }
        
        if(n==0)
        {
            return arr[0];
        }
        
        if(dp_arr[n]!=-1)
        {
            return dp_arr[n];
        }
        return dp_arr[n]=arr[n]+Math.max(dp_max(arr,n-3),dp_max(arr,n-2));
    }
}