/**
 * @author AkashGoyal
 * @date 01/06/2021
 */

/**


--------------------- Problem----------->>  Triplet Sum in Array

    Problem Link :- https://practice.geeksforgeeks.org/problems/triplet-sum-in-array-1587115621/1
  */
  
    //Use 3 pointer concept --> one at 0, 2nd at 1 and 3rd at n-1;
   /* ---------------------------------------------------------------------------
    
 Exp:1  1 4 45 6 10 8  -----X=13
    
        1 4 6 8 10 45--> sort
        | |         |  --> pointers
        | |     |
        | |   |-->> return true;
    
    ---------------------------------------------------------------------------
    ---------------------------------------------------------------------------
    
 Exp:2  1 2 4 3 6   ----- X=10
    
        1 2 3 4 6--> sort
        | |     |  --> pointers
        | |     |
        | |   |-->> return true;
    
    ---------------------------------------------------------------------------
    */


  public static boolean find3Numbers(int A[], int n, int X) { 
    
    // Your code Here
    
    //Sorting the array
    Arrays.sort(A);
    
    int lowest_element_index=0;
    int mid_element_index=1;
    int last_element_index=n-1;
    
    //increassing lowest and checking till it becomes n-3
    while(lowest_element_index<n-2)
    {
       //starting from mid_element_index to n-1--> to include every case
       
       mid_element_index=lowest_element_index+1;
       last_element_index=n-1;
       
       //while lowest is fixed we are changing last and mid elements and getting different combinations
            while(mid_element_index<last_element_index)
                {
                    //if sum is greater then what we want then decreasing the largest element
                     if(A[lowest_element_index]+A[mid_element_index]+A[last_element_index]>X)
                         {
                             last_element_index--;
                         }
                         
                     //if x is greater then what we want then increasing the smallest element
                     else if(A[lowest_element_index]+A[mid_element_index]+A[last_element_index]<X)
                         {
                             mid_element_index++;
                         }
                     else
                         {
                             return true;
                         }
           
                }
        
         lowest_element_index++;
                         
    }
    
    return false;
    
 
 }
