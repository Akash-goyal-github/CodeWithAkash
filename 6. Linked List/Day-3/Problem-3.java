/**
 * @author Akash Goyal
 */

/**


--------------------- Problem----------->>  Middle of the Linked List 

    Problem Link :- https://leetcode.com/problems/middle-of-the-linked-list/
 
    */
    
    class Solution {
        public ListNode middleNode(ListNode head) {
            ListNode slow=head;
            ListNode fast=head;
            
            while(fast.next!=null)
            {
                slow=slow.next;
                fast=fast.next;
                if(fast.next!=null)
                {
                    fast=fast.next;
                }
            }
            
            return slow;
            
        }
    }