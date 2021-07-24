/**
 * @author AkashGoyal
 */

/**


--------------------- Problem----------->>  Find first and last positions of an element in a sorted array

    Problem Link :- https://practice.geeksforgeeks.org/problems/first-and-last-occurrences-of-x/0

  */

  class Solution {
      ArrayList<Long> find(long arr[], int n, int x)
    {
        // code here
        ArrayList<Long>alist=new ArrayList<Long>();
        
        //Searching the element through binary search
        int mid= BinSearch(arr,0,n-1,x);
        
        //edge cases(if x does not exist)
        
         if(mid==-1)
         {
             alist.add((long)-1);
             alist.add((long)-1);
             
             return alist;
         }
         
         //if we found x at mid index; 
         
         
         
            int move_left=mid-1;
            int move_right=mid+1;
            
        //now traverse to the left till we find different element 
            while(move_left>=0)
            {
                if(x!=arr[move_left])
                {
                    break;
                }
                move_left--;
            }
            alist.add((long)move_left+1);
             
        //now traverse to the right till we find different element
            while(move_right<=arr.length-1)
            {
                if(x!=arr[move_right])
                {
                    break;
                }
                move_right++;
            }
             alist.add((long)move_right-1);
             
         return alist;
    }
        
    public int BinSearch(long arr[], int left,int right, int x)
    {
        int mid=0;
        while(left<=right)
        {
            mid=left+(right-left)/2;
        
            if(x<arr[mid])
            {
                right=mid-1;
            }
            else if(x>arr[mid])
            {
                left=mid+1;
            }
            else
            {
                return mid;
            
            }
        }
        
        return -1;
    }
        
    
}
