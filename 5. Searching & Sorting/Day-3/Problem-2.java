/**
 * @author AkashGoyal
 */

/**


--------------------- Problem----------->>   find majority element

    Problem Link :- https://practice.geeksforgeeks.org/problems/majority-element-1587115620/1

    Reference:- https://www.youtube.com/watch?v=AoX3BPWNnoE
    
  */


class Solution
{
    static int majorityElement(int a[], int size)
    {
        // your code here
        
        int major_element=-1;
        int major_count=0;
        for(int i=0;i<size;i++)
        {
            if(major_element==-1)
            {
                major_element=a[i];
            }
            if(major_element==a[i])
            {
                major_count++;
            }
            else
            {
                major_count--;
            }
            
            if(major_count==0)
            {
                major_element=-1;
            }
            
        }
        
        int count=0;
        for(int i=0;i<size;i++)
        {
           if(major_element==a[i])
           {
               count++;
           }
        }
        if(count>size/2)
        {
            return major_element;
        }
        return -1;
        
    }
}
