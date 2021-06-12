/**
 * @author AkashGoyal
 * @date 28/05/2021
 */

/**


--------------------- Problem----------->> Common elements

    Problem Link :- https://practice.geeksforgeeks.org/problems/common-elements1132/1

  */


//Solution-1

class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        // code here 
        
        ArrayList<Integer> arlist=new ArrayList<Integer>();
        int i=0;
        int j=0;
        int k=0;
        
        while(i<n1 && j<n2 && k<n3)
        {
            if(A[i]==B[j] && B[j]==C[k])
            {
                if(arlist.size()==0)
                    {
                        arlist.add(A[i]);    
                    }    
                if(arlist.size()>0)
                    {
                        if(arlist.get(arlist.size()-1)!=A[i])
                            {
                                arlist.add(A[i]);
                            }
                    }
                    i++;
                    j++;
                    k++;
            }
            else
            {
                int min=Math.min(Math.min(A[i],B[j]),Math.min(A[i],C[k]));
                
                if(min==A[i])
                {
                    i++;
                }
                if(min==B[j])
                {
                    j++;
                }
                if(min==C[k])
                {
                    k++;
                }
            }
            
            }
        
        
        return arlist;
    }
}


--------------------------------------------------------------------------------------------------------------------------

//Solution-2


class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        // code here 
        
        ArrayList<Integer> modified_array=new ArrayList<>();
        
        int i=0;
        int j=0;
        int k=0;
        while(i<n1 && j<n2 && k<n3)
        {
            
                if(A[i]<B[j])
                {
                    if(A[i]<C[k])
                    {
                        i++;
                    }
                    else if(C[k]<A[i])
                    {
                        k++;
                    }
                    else
                    {
                        i++;
                        k++;
                    }
                }
                else if(B[j]<A[i])
                {
                    if(B[j]<C[k])
                    {
                        j++;
                    }
                    else if(C[k]<B[j])
                    {
                        k++;
                    }
                    else
                    {
                        k++;
                        j++;
                    }
                }
                else
                {
                    if(B[j]<C[k])
                    {
                            i++;
                            j++;
                    }
                    else if(C[k]<B[j])
                    {
                        k++;
                    }
                    else
                    {
                        if(modified_array.size()==0)
                        {
                             modified_array.add(A[i]);
                                
                        }
                        if(modified_array.size()>0)
                        {
                            if(modified_array.get(modified_array.size()-1)!=A[i])
                            {
                                modified_array.add(A[i]);
                               
                            }
                         
                        }
                            i++;
                            j++;
                            k++;
                    }
                }
            
            
        }
        
        return modified_array;
    }
}