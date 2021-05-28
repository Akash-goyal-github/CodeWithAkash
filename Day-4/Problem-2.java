/**
 * @author AkashGoyal
 * @date 27/05/2021
 */

/**


--------------------- Problem----------->> Merge 2 sorted Array without Using extra space

    Problem Link :- https://practice.geeksforgeeks.org/problems/merge-two-sorted-arrays5135/1

  */



class Solution {

  public void merge(int arr1[], int arr2[], int n, int m) {
      // code here
    
    
    /*
    Trick:- 
      step-1 comparing 2nd array starting(lowest Numbers) with 1st array last (highest numbers) and swapping.
      step-2 when all 1st array elements are replaced with smaller once. Then we will sort both the arrays separately.
    */  
  
      
      int i=arr1.length-1;
      int j=0;
      
      while(i>=0 && j<=arr2.length-1)
      {
          if(arr1[i]<=arr2[j])
          {
              break;
          }
          else
          {
              int temp=arr2[j];
              arr2[j]=arr1[i];
              arr1[i]=temp;
              i--;
              j++;
          }
          
      }
      
      Arrays.sort(arr1);
      Arrays.sort(arr2);
  }
}