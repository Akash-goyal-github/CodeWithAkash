/**
 * @author AkashGoyal
 * @date 09/06/2021
 */

/**


--------------------- Problem----------->>   Check whether a String is Palindrome or not

    Problem Link :- https://practice.geeksforgeeks.org/problems/palindrome-string0817/1

  */


class Solution {
    int isPlaindrome(String S) {
        // code here
        int left=0;
        int right=S.length()-1;
        
        while(left<right)
        {
            if(!(S.charAt(left)+"").equals(S.charAt(right)+""))
            {
                return 0;
            }
            left++;
            right--;
        }
        
        return 1;
    }
};