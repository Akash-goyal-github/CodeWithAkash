/**
 * @author Akash Goyal
 */

/**


--------------------- Problem----------->>  Check if Linked List is Palindrome 

    Problem Link :- https://practice.geeksforgeeks.org/problems/check-if-linked-list-is-pallindrome/1

    Reference:- https://www.youtube.com/watch?v=-DtNInqFUXs
  */

  class Solution
  {
      //Function to check whether the list is palindrome.
      boolean isPalindrome(Node head) 
      {
          //Your code here
          Node node=head;
          
          int length=0;
          while(node!=null)
          {
              node=node.next;
              length++;
          }
          
          node=head;
          
          
          int c=0;
          if(length%2!=0)
          {
              while(c<length/2)
              {
                  node=node.next;
                  c++;
              }
              
              Node current=node.next;
              
              Node prev=null;
              
              while(current!=null)
              {
                  
                  Node temp=current;
                  current=current.next;
                  temp.next=prev;
                  prev=temp;
              }
              
              Node start=head;
              
              while(start!=null && prev!=null)
              {
                  if(start.data!=prev.data)
                  {
                      return false;
                  }
                  start=start.next;
                  prev=prev.next;
              }
              
          }
          else
          {
              while(c<length/2)
              {
                  node=node.next;
                  c++;
              }
              
              Node current=node;
              
              Node prev=null;
              
              while(current!=null)
              {
                  
                  Node temp=current;
                  current=current.next;
                  temp.next=prev;
                  prev=temp;
              }
              
              Node start=head;
              
              while(start!=null && prev!=null)
              {
                  if(start.data!=prev.data)
                  {
                      return false;
                  }
                  start=start.next;
                  prev=prev.next;
              }
          }
          return true;
      }    
  }
  
  