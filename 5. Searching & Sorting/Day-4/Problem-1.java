/**
 * @author AkashGoyal
 */

/**


--------------------- Problem----------->>  find a pair with a given difference

    Problem Link :- https://practice.geeksforgeeks.org/problems/find-pair-given-difference1559/1

    Reference Link:- https://www.youtube.com/watch?v=5IUyc7cPD9E
    
  */

  
class Solution
{
    public boolean findPair(int arr[], int size, int n)
    {
        //code here.
        Arrays.sort(arr);
       // 2 3 5 5 20 80
        int left=0;
        int right=1;
        while(left<size && right<size)
        {
            if(arr[right]-arr[left]>n)
            {
                left++;
            }
            else if(arr[right]-arr[left]<n){
                right++;
            }
            else
            {
                return true;
            }
            
        }
        
        return false;
    }
}