/**
 * @author AkashGoyal
 * @date 03/06/2021
 */

/**


--------------------- Problem----------->>  Three way partitioning 

    Problem Link :- https://practice.geeksforgeeks.org/problems/three-way-partitioning/1

    Reference:- https://www.youtube.com/watch?v=ptIRm-GTUdw
  */
  
  
 // Method-1

  public void threeWayPartition(int array[], int a, int b)
    {
        int n=array.length;
        int pointer=0;
        int right=n-1;
        int left=0;
        
        //two pointer approach
        
        while(pointer<=right)
        {
            //comparing with a, only taking care that left moves only if <a element is present at pointer
            if(array[pointer]<a)
            {
                if(left!=pointer)
                {
                    int temp=array[pointer];
                    array[pointer]=array[left];
                    array[left]=temp;
                }
                pointer++;
                left++;
            }
             //comparing with b, only taking care that right moves only if >b element is present at pointer
           
            else if(array[pointer]>b)
            {
                if(right!=pointer)
                {
                    int temp=array[pointer];
                    array[pointer]=array[right];
                    array[right]=temp;
                }
                right--;
            }
            else// increase pointer if nothing works
            {
                pointer++;
            }
        }
    }

//---------------------------------------------------------------------------------------------------------------------------------------------------------

// Method-2

public void threeWayPartition(int array[], int a, int b)
    {
        // code here 
        
        int first=0;
        int n=array.length;
        int second=n-1;
        
        int less_a_count=0;
        int greater_b_count=0;
        
        for(int i=0;i<n;i++)
        {
            if(array[i]<a)
            {
                less_a_count++;
            }
        }
        
        for(int i=0;i<n;i++)
        {
            if(array[i]>b)
            {
                greater_b_count++;
            }
        }
        
        int a_index=0;// from here <a element will be stored
        int mid_index=less_a_count; //here >a but <b elements will be stored from here
        int b_index=n-greater_b_count; // here >b elements will be stored
        
        int pointer=mid_index;
        
        while(a_index<mid_index)
        {
            //if value is less increase a pointer
            if(array[a_index]<a)
            {
                a_index++;
            }
            else
            {
                /*
                if value is more or equal then swap the element
                    (so that at least that value will go in mid elements) and 
                    increase the pointer for further comparisions.
                  
                    */
                int temp=array[pointer];
                array[pointer]=array[a_index];
                array[a_index]=temp;
                pointer++;
            }
        }
        
       /*  we got <a value on left side.*/ 
       
       /*Now same thing will be repeated for mid and >b elements*/
       
        pointer=mid_index;
        while(b_index<n)
        {
            if(array[b_index]>b)
            {
                b_index++;
            }
            else
            {
                int temp=array[pointer];
                array[pointer]=array[b_index];
                array[b_index]=temp;
                pointer++;
            }
        }
        
    }