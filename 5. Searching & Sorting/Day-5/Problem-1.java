/**
 * @author AkashGoyal
 */

/**


--------------------- Problem----------->>  Count triplet with sum smaller than a given value

    Problem Link :- https://practice.geeksforgeeks.org/problems/count-triplets-with-sum-smaller-than-x5549/1

  */

  
class Solution
{
    long countTriplets(long arr[], int n,int sum)
    {
        Arrays.sort(arr);
        
        long count=0;
        for(int i=0;i<n-2;i++)
        {
            int left=i+1;
            int right=n-1;
            
            while(left<right)
            {
                long total=arr[i]+arr[left]+arr[right];
                
                if(total<(long)sum)
                {
                    count+=right-left;
                    left++;
                }
                else
                {
                    right--;
                }
            }
        }
        
        return count;
    }
}
