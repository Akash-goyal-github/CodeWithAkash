/**
 * @author AkashGoyal
 * @date 24/05/2021
 */

/**


--------------------- Problem----------->> Find minimum and maximum element in an array

    Problem Link :- https://practice.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1#


  */


  //Method-1 

class Compute 
{
    static pair getMinMax(long a[], long n)  
    {
        long max=0;
        long min=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        return new pair(min,max);
    }
}




//-----------------------------------------------------------------------------------------------------------


//Method-2 O(n)--> Minimum Swap



class Compute 
{
    static pair getMinMax(long a[], long n)  
    {
       
        
       /* 
       
        // Solution with Minimum comparisions
        
        1 2 3 4 = 8
        1 2 => 1
        3 4 => 1
        1 2 3 4 => 2
        total = 4
        
        (3*n)/2-2
        if n is power of 2;
        
        otherwise
        >(3*n)/2-2*/
        
        return MinMax(a, 0, (int)(n-1));
    }
    
    
    static pair MinMax(long a[],int low, int high)
    {
        pair minmaxleft=new pair(0,0);
        pair minmaxright=new pair(0,0);
        
        //only one element
        if(low==high)
        {
            minmaxleft.first=a[low];
            minmaxright.second=a[high];
            
            return new pair(minmaxleft.first,minmaxright.second);
        }
        
        //two element
        
        if(low==high-1)
        {
            if(a[low]<a[high])
            {
                minmaxleft.first=a[low];
                minmaxright.second=a[high];
            }
            else
            {
                
                minmaxleft.first=a[high];
                minmaxright.second=a[low];
            }
            
            return new pair(minmaxleft.first,minmaxright.second);
            
        }
        
        //More then two elements
        
        int mid=low+(high-low)/2;
        
        minmaxleft=MinMax(a,low,mid);
        minmaxright=MinMax(a,mid+1,high);
        
        if(minmaxleft.first<minmaxright.first)
        {
            minmaxright.first=minmaxleft.first;
        }
        
        
        if(minmaxleft.second>minmaxright.second){
            
            minmaxright.second=minmaxleft.second;
        }
        
        return new pair(minmaxright.first,minmaxright.second);
    }
}






