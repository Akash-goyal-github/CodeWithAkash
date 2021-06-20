/**
 * @author AkashGoyal
 * @date 10/06/2021
 */

/**


--------------------- Problem----------->>   First Repeated Character in a string

    Problem Link :- https://practice.geeksforgeeks.org/problems/repeated-character2058/1#
    
  */


class Solution
{
    char firstRep(String S)
    {
        // your code here
        int arr[]=new int[26];
        for(int i=0;i<S.length();i++)
        {
            
            arr[(int)S.charAt(i)-97]++;
            
        }
        
        for(int i=0;i<S.length();i++)
        {
            if(arr[(int)S.charAt(i)-97]>1)
            {
                return S.charAt(i);
            }
        }
        
        
        return '#';
    }
}