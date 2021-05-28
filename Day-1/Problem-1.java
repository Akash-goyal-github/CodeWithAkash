/**
 * @author AkashGoyal
 * @date 24/05/2021
 */

/**

--------------------- Problem----------->> Reverse the array

    Problem Link :- https://practice.geeksforgeeks.org/problems/reverse-an-array/0

  */


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