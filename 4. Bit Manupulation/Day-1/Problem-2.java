/**
 * @author AkashGoyal
 */

/**


--------------------- Problem----------->>   Find the two non-repeating elements in an array of repeating elements

    Problem Link :- https://practice.geeksforgeeks.org/problems/finding-the-numbers0215/1

    Reference:-
    

            Method-1:-

            https://www.youtube.com/watch?v=XcSr6TIMl7w 
            https://www.youtube.com/watch?v=pnx5JA9LNM4  (For this question:)

            -------------------------------------------------------------------------------------------------------------
            Method-2

            Java lang.Integer.toBinaryString() 
            More:- https://www.youtube.com/watch?v=bTauscvOymA

  */

// Method:-1


class Solution
{
    public int[] singleNumber(int[] nums)
    {
        // Code here
        
        int res=0;
        
        //calculating xor of every number so that only single elements will be left out
        for(int i=0;i<nums.length;i++)
        {
            res=res^nums[i];
        }
        
        //now result has xor of 3^4
        
        //now we need to separate these two elements
        // so lets check the right most bit of res which is one.
        // because different bits make 1 so we can get them separate from here.
        
        //get the right most bit which is one
        int num1=0;
        int num2=0;
        
        int rsbm=res & -res;
        for(int i=0;i<nums.length;i++)
        {
            if((nums[i] & rsbm)==0)
            {
                num1=num1^nums[i];
            }
            else
            {
                num2=num2^nums[i];
            }
        }
        
        int number[]=new int[2];
        number[1]=Integer.max(num1,num2);
        number[0]=Integer.min(num1,num2);;
        
        return number;
        
        
    }
}


// -----------------------------------------------------------------------------------------

// Method:-2



class Solution
{
    public int[] singleNumber(int[] nums)
    {
        // Code here
        
        int res=0;
        
        //calculating xor of every number so that only single elements will be left out
        for(int i=0;i<nums.length;i++)
        {
            res=res^nums[i];
        }
        
        //now result has xor of 3^4
        
        //now we need to separate these two elements
        // so lets check the right most bit of res which is one.
        // because different bits make 1 so we can get them separate from here.
        
        //get the right most bit which is one
        
        StringBuilder sb=new StringBuilder();
        
        int copynum[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            copynum[i]=nums[i];
        }
        
        while(res>0)
        {
            sb.append(res%2);
            res=res/2;
        }
        while(sb.toString().length()<32)
        {
            sb.append("0");
        }
        
        int right_most_one=0;
        
        sb.reverse();
        
        for(int i=sb.toString().length()-1;i>=0;i--)
        {
            if((sb.toString().charAt(i)+"").equals("1"))
            {
                right_most_one=i;
                break;
            }
        }
        
        //We got the right most bit
        
        //System.out.println(right_most_one);
        
        
        //now we will do xor for the integers which differs at that bit
        
        int num1=0;
        int num2=0;
        
        for(int i=0;i<copynum.length;i++)
        {
              StringBuilder sb1=new StringBuilder();
        
        while(copynum[i]>0)
        {
            sb1.append(copynum[i]%2);
            copynum[i]=copynum[i]/2;
        }
        while(sb1.toString().length()<32)
        {
            sb1.append("0");
        }
        
        sb1.reverse();
     
            if((sb1.toString().charAt(right_most_one)+"").equals("1"))
            {
                //System.out.println(nums[i]+" "+0);
                num1=num1^(nums[i]);
            }
            else
            {
               // System.out.println(nums[i]+" "+1);
                num2=num2^(nums[i]);
            }
        }
        
        int number[]=new int[2];
        number[1]=Integer.max(num1,num2);
        number[0]=Integer.min(num1,num2);;
        
        return number;
        
        
    }
}