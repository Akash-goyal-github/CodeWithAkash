/**
 * @author AkashGoyal
 * @date 30/05/2021
 */

/**


--------------------- Problem----------->> Rearrange the array in alternating positive and negative items with O(1) extra space

    Problem Link :- https://practice.geeksforgeeks.org/problems/array-of-alternate-ve-and-ve-nos1401/1

  */


  // Using o(n) space complexity

class Solution {
    void rearrange(int arr[], int n) {
        // code here
        
        //we will store all +ve element in the left side and negative on the right in arrcopy[]
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
        
        int neg_start=k;
        
        for(int i=0;i<n;i++)
        {
            if(arr[i]<0)
            {
                arrcopy[k]=arr[i];
                k++;
            }
        }
        
        //how we will arrange positive negative alternatively in the array by two pinters.

        int pos=0;
        int neg=neg_start;
        k=0;
        while(pos<neg_start && neg<n)
        {
            
            arr[k]=arrcopy[pos];
            k++;
            pos++;
            arr[k]=arrcopy[neg];
            k++;
            neg++;
        }
        
        while(pos<neg_start)
        {
            arr[k]=arrcopy[pos];
            k++;
            pos++;
        }
        while(neg<n)
        {
            arr[k]=arrcopy[neg];
            k++;
            neg++;
        }
    }
}