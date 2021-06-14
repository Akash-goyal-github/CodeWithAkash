/**
 * @author AkashGoyal
 * @date 31/05/2021
 */

/**


--------------------- Problem----------->> find maximum product subarray 

    Problem Link :- https://practice.geeksforgeeks.org/problems/maximum-product-subarray3604/1

  */

  
/* 
-------------------------------------------------------------------------------

Exp:-1  6 -3 -10 -100 0

localmin--> 6  -18  -10 -18000
localmax--> 6  -3   180   1000
    
globalmax--> 180  1000

-------------------------------------------------------------------------------

Exp:-2       2   3   -4      5     -1         0         5       -6

localmin-->  2  2*3 6*-4  -24*5    -4*5*-1    0         1*5       -30

localmax-->  2  2*3 6*-4  -4*5    -24*5*-1    0         1*5        -6

globalmax--> 2    2   6     6       6       -24*5*-1  -24*5*-1  -24*5*-1

-------------------------------------------------------------------------------
  */
   

  long maxProduct(int[] arr, int n) {
    // code here
    
       // code here
    long localmin=arr[0];
    long localmax=arr[0];
    long globalmax=arr[0];
   
  for(int i=1;i<n;i++)
  {
      if(arr[i]==0)
      {
          //because there is 0 as an element so maximum product will be atleast 0.
          if(globalmax<0)
          {
              globalmax=0;
          }
          //0 can be taken as divider between subarrays.
          //After putting value in globalmax we will again look for next suarray and restart the process
           localmax=1;
           localmin=1;
      }
      else if(arr[i]<0)
      {
           /*we are diffining these because (updated localmax will be used if 
          we don't do this when we calculate localmin )*/
          
          long lmin=localmin;
          long lmax=localmax;
         
          //taking max of current element,previous min*now (-*- -->+)
          //-ve arr[i] means take min*(-ve)--> max
          localmax=Math.max(arr[i],arr[i]*lmin);
          localmin=Math.min(arr[i],arr[i]*lmax);
          
          if(globalmax<localmax)
          {
              globalmax=localmax;
          }
      }
      else
      {
          //if arr[i] non negative min goes into minimum and max to max
          localmax=Math.max(arr[i],arr[i]*localmax);
          localmin=Math.min(arr[i],arr[i]*localmin);
          
          if(globalmax<localmax)
          {
              globalmax=localmax;
          }
      }
  }
  
  return globalmax;
        
      
        
}