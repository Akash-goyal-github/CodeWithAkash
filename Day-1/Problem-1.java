/**
 * @author AkashGoyal
 * @date 24/05/2021
 */

/**

--------------------- Problem----------->> Reverse the array

    Problem Link :- https://practice.geeksforgeeks.org/problems/reverse-an-array/0

  */


//Method-1  (Changing the array)


import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 //code
	 
	 Scanner scan=new Scanner(System.in);
	 int t=scan.nextInt();
	 
	 for(int j=0;j<t;j++)
	 {
	 
	 int n=scan.nextInt();
	 int arr[]=new int[n];
	 for(int i=0;i<n;i++)
	 {
	     arr[i]=scan.nextInt();
	 }
	   int left=0;
	   int right=n-1;
	   
	   while(left<right)
	   {
	       
	       int temp=arr[right];
	       arr[right]=arr[left];
	       arr[left]=temp;
	       left++;
	       right--;
	   }
	   
	   for(int i=0;i<n;i++)
	 {
	     System.out.print(arr[i]+" ");
	 }
	 System.out.println();
	 
	 }
	 }
}


//----------------------------------------------------------------------------------------------------


//Method-2 Printing the array elements from last


import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 //code
	 Scanner scan=new Scanner(System.in);
	 int T=scan.nextInt();
	 for(int i=0;i<T;i++)
	 {
	     int N=scan.nextInt();
	     int arr[]=new int[N];
		 
		 //Taking Input

	     for(int j=0;j<N;j++)
	     {
	         arr[j]=scan.nextInt();
	     }

		 //Printing in reverse Order

	     for(int j=N-1;j>=0;j--)
	     {
	         System.out.print(arr[j]+" ");
	     }
	     System.out.println();
	 }
	 }
}