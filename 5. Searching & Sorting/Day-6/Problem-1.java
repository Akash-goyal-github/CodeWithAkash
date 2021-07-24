/**
 * @author AkashGoyal
 */

/**


--------------------- Problem----------->>   Product array puzzle 

    Problem Link :- https://practice.geeksforgeeks.org/problems/product-array-puzzle4525/1

    Reference Link:- https://www.youtube.com/watch?v=5IUyc7cPD9E
    
  */

  
class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
        // code here
        
        long arr[]=new long[n];
        long leftprod=1;
        
        arr[0]=1;
        for(int i=1;i<n;i++)
        {
            leftprod*=nums[i-1];
            arr[i]=leftprod;
        }
        
        long rightarr[]=new long[n];
        long rightprod=1;
        
        rightarr[n-1]=1;
        for(int i=n-2;i>=0;i--)
        {
            rightprod*=nums[i+1];
            rightarr[i]=rightprod;
        }
        
        
        
        long result[]=new long[n];
        
        for(int i=0;i<n;i++)
        {
            result[i]=arr[i]*rightarr[i];
        }
        
        return result;
	} 
} 
