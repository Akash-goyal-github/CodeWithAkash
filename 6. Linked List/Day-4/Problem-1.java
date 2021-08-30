/**
 * @author AkashGoyal
 */

/**


--------------------- Problem----------->>  Sort a LL of 0's, 1's and 2's

    Problem Link :- https://practice.geeksforgeeks.org/problems/given-a-linked-list-of-0s-1s-and-2s-sort-it/1

  */

  class Solution
  {
      //Function to sort a linked list of 0s, 1s and 2s.
      static Node segregate(Node head)
      {
          // add your code here
          
          int zeros=0;
          int ones=0;
          int twos=0;
          
          Node node=head;
          
          while(head!=null)
          {
              if(head.data==0)
              {
                  zeros++;
              }
              else if(head.data==1)
              {
                  ones++;
              }
              else
              {
                  twos++;
              }
              head=head.next;   
          }
          
          Node node1=node;
          
          
          
          while(zeros>0)
          {
                  node.data=0;
                  node=node.next;
              zeros--;
          }
          while(ones>0)
          {
                  node.data=1;
                  node=node.next;
              ones--;
          }
          while(twos>0)
          {
                  node.data=2;
                  node=node.next;
              twos--;
          }
          return node1;
      }
  }
  
  
  