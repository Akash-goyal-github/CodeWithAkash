/**
 * @author AkashGoyal
 */

/**


--------------------- Problem----------->>    Remove loop in Linked List 

    Problem Link :- https://practice.geeksforgeeks.org/problems/remove-loop-in-linked-list/1

    Reference:- https://www.youtube.com/watch?v=QfbOhn0WZ88

     
  */


class Solution
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
        
        Node start=head;
        Node slow=head;
        Node fast=head;
        Node prev=null;
        
        while(fast!=null && fast.next!=null)
        {
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                break;
            }
        }
        
        if(fast==null || fast.next==null)
        {
            return;
        }
        while(start!=slow)
        {
            prev=slow;
            start=start.next;
            slow=slow.next;
        }
            prev.next=null;
    }
}