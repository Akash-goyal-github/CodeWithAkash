/**
 * @author AkashGoyal
 * @date 04/06/2021
 */

/**


--------------------- Problem----------->> Find the median

    Problem Link :- https://practice.geeksforgeeks.org/problems/find-the-median0527/1

  */

  public int find_fact(int[] v)
    {
        // Code here
        Arrays.sort(v);
        int n=v.length;
        if(n%2==0)
        {
            int sum=0;
            sum+=v[(n-1)/2]+v[n/2];
            
            return sum/2;
        }
        return v[n/2];
        
    }