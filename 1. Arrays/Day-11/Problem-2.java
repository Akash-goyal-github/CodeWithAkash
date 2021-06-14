/**
 * @author AkashGoyal
 * @date 03/06/2021
 */

/**


--------------------- Problem----------->>  Minimum swaps and K together 

    Problem Link :- https://practice.geeksforgeeks.org/problems/minimum-swaps-required-to-bring-all-elements-less-than-or-equal-to-k-together/0

    Reference:- https://www.youtube.com/watch?v=DkOaYAfolnQ&t=300s
  */
  

  public static int minSwap (int arr[], int n, int k) {
        //Complete the function
        
        //Sliding window approach
        
       /* 
       
       1. first we will calculate that how many elements are less then or equal to k
        
            2 1 5 6 3  k=3
        
        2. we will have sliding window of size equal to the total count of element which is <=k.
        
           condition-1 [2 1 5] 6 3--> (> k)-->1 (we need to swap 1 number (3) in place of 5)
                        |   |
            
           condition-2 2 [1 5 6] 3--> (> k)-->2 (we need to swap 2 numbers(2,3) in place of 5,6)
                          |   |
            
           condition-3 2 1 [5 6 3]--> (> k)-->2 (we need to swap 2 numbers(2,1) in place of 5,6)
                            |   |
            
        
        3. Now we will take min of ( the numbers >k in each sliding window).
        
            *****so we got minimum ans 1 swap in condition 1.
        
        4. Because we just need minimum numbers which can come in those positions.
        
        
        */
        
        //First we are calculating count of <=k elements to make a sliding window of that size.
        
       int less_equal_k=0;
        
       for(int i=0;i<n;i++)
       {
           if(arr[i]<=k)
           {
               less_equal_k++;
           }
       }
       
       //sliding window
       
       int start_window=0;
       int end_window=less_equal_k-1;
       
     /*  minimum swap count will be the elements which are >k in a sliding window because instead of 
       them (<=k) elements will come so that means minimum swapping*/
       
       int min_swap=0;
       
       for(int i=0;i<=end_window;i++)
       {
           if(arr[i]>k)
           {
                min_swap++;
           }
       }
       
       //local_swap for all windows will be stored in local_swap.
       
       //local_swap is (>k) because instead of them <=k elements will come(swap will happen)
       
       int local_swap=min_swap;
       
       
       //till window reaches to end
       while(end_window<n-1)
       {
           /*checking element which is entering window is <=k if yes then decreassing the local_swap count by one.otherwise no need to worry leave the count as it is*/
           
           end_window++;
           if(arr[end_window]<=k)
           {
               local_swap--;
           }
           
           /*checking element which is entering window is <=k if yes then increase local count because a swap is increased may be*/
           
           if(arr[start_window]<=k)
           {
               local_swap++;
           }
           start_window++;
           
           
           //keeping the minimum swap required
           if(local_swap<min_swap)
           {
               min_swap=local_swap;
           }
       }
       
       return min_swap;
    }