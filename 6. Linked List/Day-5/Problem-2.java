/**
 * @author Akash Goyal
 */

/**


--------------------- Problem----------->>  Delete without head pointer

    Problem Link :- https://practice.geeksforgeeks.org/problems/delete-without-head-pointer/1

  */


  class Solution
  {
      void deleteNode(Node del)
      {
           // Your code here
           del.data=del.next.data;
           del.next=del.next.next;
           
      }
  }
  
  