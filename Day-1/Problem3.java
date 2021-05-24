/**
 * @author AkashGoyal
 * @date 24/05/2021
 */

/**


--------------------- Problem----------->> Kth smallest element 

    Problem Link :- https://practice.geeksforgeeks.org/problems/kth-smallest-element5635/1


    Concept:-

        Min-Heap − Where the value of the root node is less than or equal to either of its children. ---> Priority Queue
            
            PriorityQueue<Integer> pq=new PriorityQueue();
    
        Max-Heap − Where the value of the root node is greater than or equal to either of its children  ---> Reverse of priority Queue 

            PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(Collections.reverseOrder());

  */

//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    
		    int arr[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    arr[i]=sc.nextInt();
		    
		    int k=sc.nextInt();
		    Solution ob = new Solution();
		    System.out.println(ob.kthSmallest(arr, 0, n-1, k));
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        
        //if k is greater then arrays length then there is no kth index so returning 0.
        if(k>arr.length)
        {
            return 0;
        }
        PriorityQueue<Integer> pq=new PriorityQueue();
        
        for(int i=0;i<=r;i++)
        {
            // Adding all elements in the priority queue
            pq.add(arr[i]);
        }
        while (k>0)
        {
            if(k==1)
            {
                //Returning kth value
                 return pq.poll();
            }

            //removing the element from top of priority queue
            pq.remove();
            k--;
            
        }
        
       return pq.poll();
        
    } 
}

