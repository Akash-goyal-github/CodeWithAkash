/**
 * @author Akash Goyal
 */

/**


--------------------- Problem----------->>  Write a Program to reverse the Linked List. 

    Problem Link :- https://practice.geeksforgeeks.org/problems/reverse-a-linked-list/1#

    Reference:- https://www.geeksforgeeks.org/reverse-a-linked-list/

  */


class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        // code here
        Node prev=null;
        Node current=head;

    while(current!=null)
    {
            Node node=current;
            current=current.next;
            node.next=prev;
            prev=node;
        
    }
        return prev;
    }
}
