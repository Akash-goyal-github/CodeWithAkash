/**
 * @author AkashGoyal
 * @date 25/05/2021
 */

/**


--------------------- Problem----------->> Union of two arrays

    Problem Link :- https://practice.geeksforgeeks.org/problems/union-of-two-arrays3538/1


    Concept:- We need to count All unique elements--> Use HashSet


  */

// Method-1 Using HashSet Data Structure

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

---------------------------------------------------------------------------------------------------------------------------------


// Method-2 Without using additional Data Structure



class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        int current_value=Integer.MIN_VALUE;
        int union_count=0;// to contain count
        
        int i=0;
        int j=0;
        while(i<n && j<m)
        {
            if(current_value<a[i] && current_value<b[j])
            {
                if(a[i]<b[j]){
                    current_value=a[i];
                    i++;
                    union_count++;
                }
                else if(a[i]>b[j])
                {
                    current_value=b[j];
                    j++;
                    union_count++;
                }
                else {
                    current_value=a[i];
                    i++;
                    j++;
                    union_count++;
                }
            }
            else if(current_value==a[i])
            {
                i++;
            }
            else if(current_value==b[j])
            {
                j++;
            }
                    
        }
        
        while(i<n)
        {
            if(current_value<a[i])
            {
                current_value=a[i];
                    i++;
                    union_count++;
            }
            else    //a[i]=current_value
            {
                i++;
            }
            
                
        }
        while(j<m)
        {
            if(current_value<b[j])
            {
                current_value=b[j];
                    j++;
                    union_count++;
            }
            else{    //b[j]= current_value
                j++;
            }     
        }
        
        return union_count;
        
        
    }
}