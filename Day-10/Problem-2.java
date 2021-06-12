/**
 * @author AkashGoyal
 * @date 02/06/2021
 */

/**


--------------------- Problem----------->>  Chocolate Distribution Problem

    Problem Link :- https://practice.geeksforgeeks.org/problems/chocolate-distribution-problem3825/1

    Reference:- https://www.youtube.com/watch?v=T_2CATt_XyQ
  */
  

   /*
        ----------------------------------------------------------------------------------
        Ex:- 7 3 2 4 9 12 56 --> M=3
        
            2  3  4  7 9 12 56 --> sort

            now make a window of size m--> 3
            
        (loop)-->>
            
           [2  3  4]  7 9 12 56
            |     |
            i   m+i-1  --> 2--> min_sum--> compare
                   
            
           2  [3  4  7] 9 12 56
               |     |
               i   m+i-1 --> 4>2 --> don't
        
           2  3  [4  7  9] 12 56
                  |     |
                  i   m+i-1 --> 5>2 --> don't
                  
           2  3  4 [7  9  12] 56
                    |      |
                    i    m+i-1 --> 5>2 --> don't
        
           2  3  4  7  [9 12 56]
                        |     |
               
        -----> Return 2(ans)--> so we are getting the minimum (from window)
        
         ----------------------------------------------------------------------------------
        
        */

        public long findMinDiff (ArrayList<Long> a, long n, long m)
        {
            // your code here
            
           
            Collections.sort(a);
            
            long min_diff=Integer.MAX_VALUE;
            int k=(int)m-1; //m+i-1
            int i=0;
            while(k<n)
            {
                if(min_diff>a.get(k)-a.get(i))
                {
                    min_diff=a.get(k)-a.get(i);
                }
                k++;
                i++;
            }
            
    
        return min_diff;
        }