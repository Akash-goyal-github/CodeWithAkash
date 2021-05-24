/**
 * @author AkashGoyal
 * @date 24/05/2021
 */

/**


--------------------- Problem----------->> Move all negative elements to end

    Problem Link :- https://practice.geeksforgeeks.org/problems/move-all-negative-elements-to-end1813/1


  */


  //Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            obj.segregateElements(a, n);
            
            for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
            
            System.out.println();
        }
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    
    public void segregateElements(int arr[], int n)
    {
        // Your code goes here
      
        int arrcopy[]=new int[n];
        int k=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>=0)
            {
                arrcopy[k]=arr[i];
                k++;
            }
        }
        
        for(int i=0;i<n;i++)
        {
            if(arr[i]<0)
            {
                arrcopy[k]=arr[i];
                k++;
            }
        }
        
        for(int i=0;i<n;i++)
        {
                arr[i]=arrcopy[i];
                
        }
        
    }
}