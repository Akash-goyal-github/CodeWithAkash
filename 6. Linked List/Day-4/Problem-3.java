/**
 * @author AkashGoyal
 */

/**


--------------------- Problem----------->>   Implement Stack using Linked List 

    Problem Link :- https://practice.geeksforgeeks.org/problems/implement-stack-using-linked-list/1

    Reference: -https://www.youtube.com/watch?v=MuwxQ2IB8lQ

  */




  class MyStack 
  {
      StackNode top;
      
      //Function to push an integer into the stack.
      void push(int a) 
      {
          // Add your code here
          StackNode node=new StackNode(a);
          
          if(top==null)
          {
              top=node;
          }
          else
          {
              node.next=top;
              top=node;
          }
          
      }
      
      //Function to remove an item from top of the stack.
      int pop() 
      {
          // Add your code here
          if(top==null)
          {
              return -1;
          }
          
          int data=top.data;
          top=top.next;
          
          return data;
      }
  }
  