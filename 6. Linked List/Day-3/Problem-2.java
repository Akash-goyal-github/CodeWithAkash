/**
 * @author AkashGoyal
 */

/**


--------------------- Problem----------->>  Pairwise swap elements of a linked list 

    Problem Link :- https://practice.geeksforgeeks.org/problems/pairwise-swap-elements-of-a-linked-list-by-swapping-data/1

  */


  class Solution {
    // Function to pairwise swap elements of a linked list.
    // It should returns head of the modified list
    public Node pairwiseSwap(Node node)
    {
        // code here
        
      Node current= node;
      int k=2;
        int count=0;
        Node prev=null;
        while(current!=null && count<k)
        {
            Node temp=current;
            current=current.next;
            temp.next=prev;
            prev=temp;
            count++;
        }
        
        if(current!=null)
        {
            node.next=pairwiseSwap(current);
        }
        
        return prev;
    }
}

