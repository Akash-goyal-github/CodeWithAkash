/**
 * @author AkashGoyal
 * @date 28/05/2021
 */

/**


--------------------- Problem----------->> Count Inversion / How far the array is from being Sorted

    Problem Link :- https://practice.geeksforgeeks.org/problems/inversion-of-array-1587115620/1

    Hint:- Use Merge-Sort   
    [Write merge sort code and then include counter to increase count by [left_array_length - current_position_of_left_array] whenever right array element is smaller then any left array element]

    Reference:- https://www.youtube.com/watch?v=kQ1mJlwW-c0
  */


class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    static long inversionCount(long arr[], long N)
    {
      
      long count=0;
      count=sort(arr,0,N-1);
      
      return count;
    }
    
    static long sort(long arr[],long first, long last)
    {
        long count=0;
        if((first<last))
        {
        long mid=first+(last-first)/2;
        
        count+=sort(arr,first,mid);
        count+=sort(arr,mid+1,last);
        
        count+=merge(arr,first,mid,last);
        
      
        }
          return count;
    }
    
    
    static long merge(long arr[],long first, long mid, long last)
    {
        
        long count=0;
        int n1=(int)mid-(int)first+1;
        int n2=(int)last-(int)mid;
        
        
        long left[]=new long[n1];
        long right[]=new long[n2];
        
        for(int i=0;i<n1;i++)
        {
            left[i]=arr[(int)first+i];
        }
        
        for(int i=0;i<n2;i++)
        {
            right[i]=arr[(int)mid+1+i];
        }
        
        int i=0;
        int j=0;
        int k=(int)first;
       while(i<(int)n1 && j<(int)n2)
       {
           if(left[i]<=right[j])
           {
               arr[k]=left[i];
               i++;
               k++;
           }
           else
           {
               arr[k]=right[j];
               count+=n1-i;
               j++;
               k++;
           }
       }
       
       while(i<(int)n1)
       {
           arr[k]=left[i];
           i++;
           k++;
       }
       
       while(j<(int)n2)
       {
           arr[k]=right[j];
           j++;
           k++;
       }
       
       
       return count;
    }
        
}