/**
 * @author AkashGoyal
 * @date 30/05/2021
 */

/**


--------------------- Problem----------->>  Subarray with 0 sum 

    Problem Link :- https://practice.geeksforgeeks.org/problems/subarray-with-0-sum-1587115621/1

    Reference:- https://www.youtube.com/watch?v=rpZfxmHTvJc (Using HashSet [data structure])

  */



  // Using HashSet [data structure]

class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[],int n)
    {
        //Your code here
        
        HashSet<Integer> hs=new HashSet<>();
        
        //Hint:- if we get sum same at two indexes means the middle elements sum is 0
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(hs.contains(sum) || sum==0 || arr[i]==0)
            {
                return true;
            }
            
            hs.add(sum);
            
            
        }
        
        return false;
    }
}