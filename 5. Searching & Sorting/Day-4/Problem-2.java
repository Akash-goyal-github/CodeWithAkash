/**
 * @author AkashGoyal
 */

/**


--------------------- Problem----------->>  find four elements that sum to a given value

    Problem Link :- https://practice.geeksforgeeks.org/problems/find-all-four-sum-numbers1732/1

    Reference Link :- https://www.youtube.com/watch?v=4ggF3tXIAp0

  */



  class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        // code here
        
        ArrayList<ArrayList<Integer>> result= new ArrayList<ArrayList<Integer>>();
        
       Arrays.sort(arr);
       
       //2 2 3 3 3 5 5 6 7 
      
        for(int i=0;i<arr.length-3;i++)
        {
            for(int j=i+1;j<arr.length-2;j++)
            {
                int left=j+1;
                int right=arr.length-1;
                while(left<right)
                {
                    ArrayList<Integer> alist=new ArrayList<>();
                    
                    int sum=arr[i]+arr[j]+arr[left]+arr[right];
                     
                    if(sum<k)
                    {
                         while(left<right && arr[left]==arr[left+1])
                            {
                                left++;
                            }
                            
                        left++;
                    }
                    else if(sum>k)
                    {
                        while(right>left && arr[right]==arr[right-1])
                            {
                                right--;
                            }
                        right--;
                    }
                    else
                    {
                        alist.add(arr[i]);
                        alist.add(arr[j]);
                        alist.add(arr[left]);
                        alist.add(arr[right]);
                        
                        result.add(alist);
                        
                        while(right>left && arr[right]==arr[right-1])
                            {
                                right--;
                            }
                        right--;
                        
                        while(left<right && arr[left]==arr[left+1])
                            {
                                left++;
                            }
                        left++;
                    }
                    
                }
                
                while(j<arr.length-3)
                {
                    if(arr[j]==arr[j+1])
                    {
                        j++;
                    }
                    else
                    {
                        break;
                    }
                }
            }
            
            while(arr.length>4 && i<arr.length-4)
                {
                    if(arr[i]==arr[i+1])
                    {
                        i++;
                    }
                    else
                    {
                        break;
                    }
                }
        }
    
        return result;
    }
}