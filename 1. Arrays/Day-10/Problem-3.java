/**
 * @author AkashGoyal
 * @date 02/06/2021
 */

/**


--------------------- Problem----------->>  Smallest subarray with sum greater than x 

    Problem Link :- https://practice.geeksforgeeks.org/problems/smallest-subarray-with-sum-greater-than-x5651/1

    Reference:- https://www.youtube.com/watch?v=NKoHjWl2m8Y

  */
  
  public static long sb(long a[], long n, long x) {
    // Your code goes here 
    
    long start=0;
    long end=0;
    long sum=0;
    long subarray_length=Integer.MAX_VALUE;
    
    //if first element is more then x then no need to go ahead
    if(a[0]>x)
    {
        return 1;
    }
    
    //end can go till n-1
    
    while(end<n)
    {
        //whenever sum is not more then x , add next element-->
        while(sum<=x && end<n)
        {
            sum+=a[(int)end];
            end++;
        }
        
        //whenever sum is more subtract the start element from sum.
        while(sum>x && start<=end)
        {
            //here we get the minimum length to store
            if(subarray_length>end-start)
            {
                subarray_length=end-start;
            }
            sum-=a[(int)start];
            start++;
        }
        
    }
    
    return subarray_length;
}