/**
 * @author AkashGoyal
 * @date 24/05/2021
 */

/**


--------------------- Problem----------->> Move all negative elements to end

    Problem Link :- https://practice.geeksforgeeks.org/problems/move-all-negative-elements-to-end1813/1


  */


class Solution {
    
    public void segregateElements(int arr[], int n)
    {
        // Your code goes here
      
        int arrcopy[]=new int[n];
        int k=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>=0)
            {
                arrcopy[k]=arr[i];
                k++;
            }
        }
        
        for(int i=0;i<n;i++)
        {
            if(arr[i]<0)
            {
                arrcopy[k]=arr[i];
                k++;
            }
        }
        
        for(int i=0;i<n;i++)
        {
                arr[i]=arrcopy[i];
                
        }
        
    }
}