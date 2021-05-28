/**
 * @author AkashGoyal
 * @date 25/05/2021
 */

/**


--------------------- Problem----------->> Union of two arrays

    Problem Link :- https://practice.geeksforgeeks.org/problems/union-of-two-arrays3538/1


    Concept:- We need to count All unique elements--> Use HashSet


  */


class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
        HashSet<Integer> hs=new HashSet<Integer>();
        for(int i=0;i<n;i++)
        {
            hs.add(a[i]);
        }
        
        for(int i=0;i<m;i++)
        {
            hs.add(b[i]);
        }
        
        return hs.size();
    }
}