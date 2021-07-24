/**
 * @author AkashGoyal
 */

/**


--------------------- Problem----------->>   Searching in an array where adjacent differ by at most k

    Problem Link :- https://practice.geeksforgeeks.org/problems/searching-in-an-array-where-adjacent-differ-by-at-most-k0456/1

    Reference:-  https://www.geeksforgeeks.org/searching-array-adjacent-differ-k/
 
    */


    // Method:- 1


        class Complete{
            
          
          // Function for finding maximum and value pair
          public static int search (int arr[], int n, int x, int k) {
              //Complete the function
              
              int i=0;
              while(i<n)
              {
                  if(arr[i]==x)
                  {
                      return i;
                  }
                  // we are adding (x-arr[i])/k in i because it gives us like min index for i where number can be present 
                  //if we take max difference that is k.
                  i+=Math.max(1,(x-arr[i])/k);
              }
              
              
          return -1;
          }
          
          
        }



        // ------------------------------------------------------------------------------------------------------------------------------------------

        // Method:- 2


            class Complete{
                
              
              // Function for finding maximum and value pair
              public static int search (int arr[], int n, int x, int k) {
                  //Complete the function
                  
                  for(int i=0;i<n;i++)
                  {
                      if(x==arr[i])
                      {
                          return i;
                      }
                  }
                  
                  return -1;
              }
              
              
            }
