/**
 * @author Akash Goyal
 */

/**


--------------------- Problem----------->>  Nth node from end of linked list 

    Problem Link :-https://practice.geeksforgeeks.org/problems/nth-node-from-end-of-linked-list/1

  */


  class GfG
  {
      //Function to find the data of nth node from the end of a linked list.
      int getNthFromLast(Node head, int n)
      {
          // Your code here
          
          //Make a window;
          
          Node start=head;
          Node end=head;
          
          while(n>0 && end!=null)
          {
              end=end.next;
              n--;
          }
          
          if(n>0 && end==null)
          {
              return -1;
          }
          
          while(end!=null)
          {
              start=start.next;
              end=end.next;
          }
          
          return start.data;
      }
  }
  