/**
 * @author AkashGoyal
 * @date 09/06/2021
 */

/**


--------------------- Problem----------->>   Find Duplicate characters in a string

    Problem Link :- https://www.geeksforgeeks.org/print-all-the-duplicates-in-the-input-string/

  */

  class Solution
{
    HashSet<Integer> firstRep(String S)
    {
        // your code here
        HashSet<Integer>hs=new HashSet<>();
        int arr[]=new int[26];
        for(int i=0;i<S.length();i++)
        {
            
            arr[(int)S.charAt(i)-97]++;
            
        }
        
        for(int i=0;i<S.length();i++)
        {
            if(arr[(int)S.charAt(i)-97]>1)
            {
                hs.add(S.charAt(i));
            }
        }

        return hs;
    }
}