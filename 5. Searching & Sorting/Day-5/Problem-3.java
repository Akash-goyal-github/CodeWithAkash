/**
 * @author AkashGoyal
 */

/**


--------------------- Problem----------->>   print all subarrays with 0 sum

    Problem Link :- https://practice.geeksforgeeks.org/problems/stickler-theif-1587115621/1

    Reference:- https://www.youtube.com/watch?v=C9-n_H7dsvU
  */




  class Solution{
    //Function to count subarrays with sum equal to 0.
    public static long findSubarray(long[] arr ,int n) 
    {
        //Your code here
        
        HashMap<Long, Long> hmap=new HashMap<>();
        
        long sum=0;
        long total=0;
        
        //to consider 0 sum as well
        hmap.put((long)0,(long)1);
        
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            if(!hmap.containsKey(sum))
            {
                hmap.put(sum,(long)1);
            }
            else
            {
                long count=hmap.get(sum);
                total+=count;
                count++;
                hmap.put(sum,count);
            }
        }
        
        return total;
    }
}