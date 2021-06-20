/**
 * @author AkashGoyal
 * @date 07/06/2021
 */

/**


--------------------- Problem----------->>   Rotate matrix by 90 degrees

    Problem Link :- https://practice.geeksforgeeks.org/problems/rotate-by-90-degree-1587115621/1

  */

//Method-1


  class Solution
{
    static void rotateby90(int matrix[][], int n) 
    { 
        // code here
        //traversing diagonally -->0,0-> 1,1...
        for(int i=0;i<n/2;i++)
        {
            for(int j=i;j<n-1-i;j++)
            {
                int currentvalue=matrix[i][j];
                int current_i=i;
                int current_j=j;
                for(int p=0;p<4;p++)
                {
                    int next_i=(n-1-current_j);
                    int next_j=current_i;
                    
                    //swap prev index with this one
                    
                    int temp=matrix[next_i][next_j];
                    matrix[next_i][next_j]=currentvalue;
                    currentvalue=temp;
                    current_i=next_i;
                    current_j=next_j;
                    
                }
            }
        }
    }
}

// ---------------------------------------------------------------------------------------------------------------------------------------------------------

//Method-2


class Solution
{
    //Function to rotate matrix anticlockwise by 90 degrees.
    static void rotateby90(int matrix[][], int n) 
    { 
        // code here
        for(int i=0;i<n/2;i++)
        {
            for(int j=i;j<n-1-i;j++)
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][n-i-1];
                matrix[j][n-i-1]=matrix[n-i-1][n-j-1];
                matrix[n-i-1][n-j-1]=matrix[n-j-1][i];
                matrix[n-j-1][i]=temp;
            }
        }
    }
}
