/**
 * @author AkashGoyal
 */

/**


--------------------- Problem----------->>  Rotate a Linked List

    Problem Link :- https://practice.geeksforgeeks.org/problems/rotate-a-linked-list/1

  */

class Solution{
    //Function to rotate a linked list.
    public Node rotate(Node head, int k) {
        // add code here
        Node node=head;
       
        
        while(node.next!=null)
        {
            node=node.next;
        }
        
        node.next=head;
        
        while(k>0)
        {
            node=node.next;
            k--;
        }
         Node start=node.next;
         node.next=null;
        
        
        return start;
        
    }
}
