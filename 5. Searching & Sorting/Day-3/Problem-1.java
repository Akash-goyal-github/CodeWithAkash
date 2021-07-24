/**
 * @author AkashGoyal
 */

/**


--------------------- Problem----------->>   Find the repeating and the missing

    Problem Link :- https://practice.geeksforgeeks.org/problems/find-missing-and-repeating2512/1
    
  */


  class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        int nums[]=new int[2];
        for(int i=0;i<n;i++)
        {
            if(arr[Math.abs(arr[i])-1]>0)
            {
                arr[Math.abs(arr[i])-1]=-arr[Math.abs(arr[i])-1];
            }
            else
            {
                nums[0]=Math.abs(arr[i]);
            }
        }
        
        for(int i=0;i<n;i++)
        {
            if(arr[i]>0)
            {
                nums[1]=i+1;
            }
        }
        
        return nums;
    }
}