/**
 * @author AkashGoyal
 */

/**


--------------------- Problem----------->>   Find a Fixed Point (Value equal to index) in a given array

    Problem Link :- https://practice.geeksforgeeks.org/problems/value-equal-to-index-value1330/1


  */

  class Solution {
    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        // code here
        
        
        ArrayList<Integer> alist=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(arr[i]==i+1)
            {
                
                alist.add(arr[i]);
            }
        }
        
        return alist;
    }
}