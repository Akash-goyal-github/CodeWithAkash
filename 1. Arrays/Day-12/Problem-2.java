/**
 * @author AkashGoyal
 * @date 04/06/2021
 */

/**


--------------------- Problem----------->> Median of 2 Sorted Arrays of Different Sizes

    Problem Link :- https://practice.geeksforgeeks.org/problems/median-of-2-sorted-arrays-of-different-sizes/0/

    Reference:- https://www.geeksforgeeks.org/median-of-two-sorted-arrays-of-different-sizes/

  */

  static double medianOfArrays(int n, int m, int a[], int b[]) 
    {
        // Your Code Here
        // Making both array sorted and also storing start from b-->a;// Use concept of two sorted array
        int i=m-1;
        int j=0;
        
        while(i>=0 && j<n)
        {
            if(a[j]<b[i])
            {
                int temp=a[j];
                a[j]=b[i];
                b[i]=temp;
                i--;
                j++;
            }
            else
            {
                break;
            }
        }
        Arrays.sort(b);//first array-m
        Arrays.sort(a);//second array-n
        
        // now all the elements of both arrays are sorted if you print arrays like first b then a then you can see it will be sorted
        
        int total_elements=a.length+b.length;
        
        //if length of both array is equal
        if(a.length==b.length)
        {
            return ((b[m-1]+a[0])*1.0)/2;
        }
        
        //if length of both array is different
        else
        {
            //if both array combined have odd number of elements.
            if(total_elements%2!=0)
                {
                    if(total_elements/2>=m)
                        {
                            return a[total_elements/2-m];
                        }
                        else
                        {
                            return b[total_elements/2];
                        }
                }
                else // if we have even number of elements in total then answer will be mean of two middle elements 
                {
                    int sum=0;
                    if(total_elements/2>=m)
                        {
                            sum+=a[total_elements/2-m];
                            // for getting one more middle number
                            if((total_elements-1)/2>=m)
                            {
                                sum+=a[(total_elements-1)/2-m];
                            }
                            else
                            {
                                sum+=b[(total_elements-1)/2];
                            }
                        }
                        else
                        {
                            sum+=b[total_elements/2]+b[(total_elements-1)/2];
                        }
                        
                        //to get the output if double then we are getting in double otherwise as integer
                        
                        if(sum%2!=0)
                        {
                            return (sum*1.0)/2; //double
                        }
                        else
                        {
                            return sum/2;//integer without decimal
                        }
                        
                }
        }
    }