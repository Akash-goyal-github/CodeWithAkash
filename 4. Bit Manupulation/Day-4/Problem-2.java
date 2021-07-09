/**
 * @author AkashGoyal
 */

/**


--------------------- Problem----------->>   Power Set 

    Problem Link :- https://practice.geeksforgeeks.org/problems/power-set4302/1

    Reference Link :- https://www.youtube.com/watch?v=b7AYbpM5YrE

  */



class Solution
{
    public List<String> AllPossibleStrings(String s)
    {
        // Code here
       
     /*  -----------------------------------------------------------------
       
       Example-1 
       
       string: abc--> all combinations
       
      
       001---> c
       010---> b
       011---> bc
       100---> a
       101---> ac
       110---> ab
       111---> abc
       
       to get all combinations we have to get all the binary string of that length
       comapare with the string wherever there is one put the character at that position from string.
       
       001--> 00c--> c
       010--> 0b0--< b
                |
                |
                |
       
       We get the output
       
       -----------------------------------------------------------------*/
       
       
        int n=s.length();
        
       List<String> list=new ArrayList<String>();
       
       //first we are finding all the binary representations till 2^n length
        
        for(int i=1;i<(int)Math.pow(2,n);i++)
        {
            String out= Integer.toBinaryString(i);
            
            StringBuilder sb=new StringBuilder();
            
            //adding 0's to make it of simiilar length as our giving string so that we can put character at exact place where one's are.
            
            StringBuilder rev_out=new StringBuilder();
            
            rev_out.append(out);
            rev_out.reverse();
            while(rev_out.length()<s.length())
            {
                rev_out.append("0");
            }
            
            rev_out.reverse();
            
            // now according to our binary strings we will arrange all charracters of string
            // so that we get all combinations
            
           for(int j=0;j<rev_out.length();j++)
            {
                if((rev_out.charAt(j)+"").equals("1"))
                {
                    sb.append(s.charAt(j));
                }
            }
            list.add(sb.toString());
        }
        
        // sorting all combinations to get lexicographically-sorted order
        Collections.sort(list);
        
        return list;
    }
}