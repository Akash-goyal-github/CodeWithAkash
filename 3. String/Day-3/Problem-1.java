/**
 * @author AkashGoyal
 */

/**


--------------------- Problem----------->>   Count and Say

    Problem Link :- https://leetcode.com/problems/count-and-say/
    
  */

class Solution {
/*  
Example:-1  
            n=4
                1--> 1--> one 1
                2--> 11--> two 1
                3--> 21--> one 2 one 1
                4--> 1211
*/
        
    public String countAndSay(int n) {
        String start="1";
        int count=1;
        
        if(n==1)
        {
            return "1";
        }
        
        while(n>1)
        {
            start=checkcount(start);
            n--;
        }
        
        return start;
        
    }
    
    static String checkcount(String start)
    { 
        
        int count=1;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<start.length()-1;i++)
        {
            if(start.charAt(i)!=start.charAt(i+1))
            {
                sb.append(count);
                sb.append(start.charAt(i));
                count=1;
            }
            else
            {
                count++;
            }
        }
     
     sb.append(count);
     sb.append(start.charAt(start.length()-1));
     
     return sb.toString();
     
    }
    
}