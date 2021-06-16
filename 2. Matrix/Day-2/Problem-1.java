/**
 * @author AkashGoyal
 * @date 06/06/2021
 */

/**


--------------------- Problem----------->>   Row with max 1s 

    Problem Link :- https://practice.geeksforgeeks.org/problems/row-with-max-1s0023/1

  */

  //Method-1 

  int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        
        int min=m;
        int row_with_max_1=-1;
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<min;j++)
            {
                if(arr[i][j]==1)
                {
                    min=j;
                    row_with_max_1=i;
                }
            }
        }
        
        return row_with_max_1;
    }

   // -------------------------------------------------------------------------------------------------------------------------------------------------------

   //Method-2  (Optimized)

   int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        
        int i=0;
        int j=m-1;
        
        int row_with_max_1=-1;
        
       while(i<n && j>=0)
       {
           if(arr[i][j]==1)
           {
               row_with_max_1=i;
               j--;
           }
           else
           {
               i++;
           }
       }
        
        return row_with_max_1;
    }