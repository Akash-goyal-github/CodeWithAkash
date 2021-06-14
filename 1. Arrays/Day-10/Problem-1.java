/**
 * @author AkashGoyal
 * @date 02/06/2021
 */

/**


--------------------- Problem----------->>  Trapping Rain Water

    Problem Link :- https://practice.geeksforgeeks.org/problems/trapping-rain-water/0
  */
  
  
  
  // Method-1 

    static int trappingWater(int arr[], int n) { 
        
        // Your code here
        int leftmax=arr[0];
        int rightmax=arr[n-1];
        int l=0;
        int r=n-1;
        int sum=0;
        while(l<r)
        {
            //when leftmax is smaller then rightmax
            if(leftmax<rightmax)
            {
                l++;
                
                if(leftmax<arr[l])
                    {
                        leftmax=arr[l];
                    }
                else
                    {
                        //adding because rightmax is big and giving support
                        sum+=leftmax-arr[l];
                    }
            }
            else//when rightmax is smaller then leftmax
            {
                r--;
                
                if(rightmax<arr[r])
                {
                    rightmax=arr[r];
                }
                else
                {
                    //adding because leftmax is big and giving support
                    sum+=rightmax-arr[r];
                }
            }
           
            
        }
       
        return sum;
    } 

//------------------------------------------------------------------------------------------------------------------------------------------------------------

   // Method-2 (At any point sum of min(leftmax,rightmax)-current)

   
   static int trappingWater(int arr[], int n) { 
    int left_arr []=new int[n];
    int right_arr []=new int[n];
    int right_max=arr[n-1];
    int left_max=arr[0];
    int total_sum=0;

    //storing the left maximum for every index
    for(int i=0;i<n;i++)
    {
        if(left_max>arr[i])
        {
            left_arr[i]=left_max;
        }
        else
        {
            left_arr[i]=arr[i];
        left_max=arr[i];
        }
    }
    
    //storing the right maximum for every index
    for(int i=n-1;i>=0;i--)
    {
        if(right_max>arr[i])
        {
            right_arr[i]=right_max;
        }
        else
        {
            right_arr[i]=arr[i];
            right_max=arr[i];
        }
    }
    
   // getting the ans as sum(min(Max(left), max(right) at every point))

    for(int i=1;i<n-1;i++)
    {
        int min=Math.min(left_arr[i-1], right_arr[i+1]);
        if(min-arr[i]<0)
        {
            continue;
        }
        else
        {
            total_sum+=min-arr[i];
        }
    }
    return total_sum;
    
} 
