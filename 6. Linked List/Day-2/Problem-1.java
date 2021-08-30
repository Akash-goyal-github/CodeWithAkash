/**
 * @author AkashGoyal
 */

/**


--------------------- Problem----------->>  Detect Loop in linked list

    Problem Link :- https://practice.geeksforgeeks.org/problems/detect-loop-in-linked-list/1

    Reference:- https://www.youtube.com/watch?v=354J83hX7RI

  */


  class Solution {
    //Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head){
        // Add code here
        Node slow=head;
        Node fast=head;
        
        int flag=0;
        while(fast!=null && slow!=null && fast.next!=null)
        {
            if(slow==fast && flag!=0)
            {
                return true;
            }
            slow=slow.next;
            fast=fast.next.next;
            
            flag=1;
        }
        
        return false;
        
    }
}