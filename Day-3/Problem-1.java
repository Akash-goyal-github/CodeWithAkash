/**
 * @author AkashGoyal
 * @date 26/05/2021
 */

/**


--------------------- Problem----------->> Minimize the Heights I

    Problem Link :- https://practice.geeksforgeeks.org/problems/minimize-the-heights-i/1/

    Reference:- https://www.youtube.com/watch?v=Av7vSnPSCtw

  */



  class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        // code here
        
        //sort the array so tat we can work on adjacent elements
        
        Arrays.sort(arr);
        //when k>n then this should be the result;(we increase everything by k then take out the difference)
        
        int result= arr[n-1]-arr[0];
        
        //by default this should be the minimum((longest-k)-(smallest+k))
        
        int largest=arr[n-1]-k;
        int smallest=arr[0]+k;
        
        for(int i=0;i<n-1;i++)
        {
            int min=Math.min(smallest,arr[i+1]-k);
            int max=Math.max(largest,arr[i]+k);
            
            result=Math.min(result,max-min);
        }
        
        return result;
    }
}
