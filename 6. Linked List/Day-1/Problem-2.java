/**
 * @author AkashGoyal
 */

/**


--------------------- Problem----------->>   Reverse a Linked List in group of Given Size. [Very Imp]

    Problem Link :- https://practice.geeksforgeeks.org/problems/reverse-a-linked-list-in-groups-of-given-size/1


  */


  class Solution
  {
      public static Node reverse(Node node, int k)
      {
          //Your code here
          
          Node current= node;
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
              node.next=reverse(current,k);
          }
          
          return prev;
      }
  }