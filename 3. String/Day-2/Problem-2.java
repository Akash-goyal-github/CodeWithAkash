/**
 * @author AkashGoyal
 * @date 10/06/2021
 */

/**


--------------------- Problem----------->>   Write a Code to check whether one string is a rotation of another

    Problem Link :- https://practice.geeksforgeeks.org/problems/check-if-strings-are-rotations-of-each-other-or-not-1587115620/1

  */


class Solution
{
    //Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2 )
    {
        // Your code here
        
        StringBuilder sb=new StringBuilder();
        
        sb.append(s1);
        sb.append(s1);
        
        if(s1.length()!=s2.length())
        {
            return false;
        }
        
        if(sb.toString().contains(s2))
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
    
}