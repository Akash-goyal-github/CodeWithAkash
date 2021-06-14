/**
 * @author AkashGoyal
 * @date 03/06/2021
 */

/**


--------------------- Problem----------->>  Palindromic Array

    Problem Link :- https://practice.geeksforgeeks.org/problems/palindromic-array/0

  */
  
  	public static int palinArray(int[] a, int n)
           {
                  //add code here.
                  
                  for(int i=0;i<n;i++)
                  {
                      StringBuilder sb=new StringBuilder();
                      sb.append(a[i]);
                      if(!(a[i]+"").equals(sb.reverse().toString()))
                      {
                          return 0;
                      }
                  }
                  
                  return 1;
           }