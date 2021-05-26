/**
 * @author AkashGoyal
 * @date 24/05/2021
 */

/**


--------------------- Problem----------->> Find minimum and maximum element in an array

    Problem Link :- https://practice.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1#


  */


class Compute 
{
    static pair getMinMax(long a[], long n)  
    {
        long max=0;
        long min=999999;
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

