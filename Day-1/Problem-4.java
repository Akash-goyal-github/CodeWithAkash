/**
 * @author AkashGoyal
 * @date 24/05/2021
 */

/**


--------------------- Problem----------->> Sort an array of 0s, 1s and 2s 

    Problem Link :- https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1


  */

  //Initial template for Java

import java.io.*;
import java.util.*;


 // } Driver Code Ends
//User function template for Java

class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
        int zeros=0;
        int ones=0;
        int twos=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==0)
            {
                zeros++;
            }
            else if(a[i]==1)
            {
                ones++;
            }
            else
            {
                twos++;
            }
        }
        
        int i=0;
       while(zeros>0)
       {
           a[i]=0;
           i++;
           zeros--;
       }
       
       while(ones>0)
       {
           a[i]=1;
           i++;
           ones--;
       }
        while(twos>0)
       {
           a[i]=2;
           i++;
           twos--;
       }
    }
}