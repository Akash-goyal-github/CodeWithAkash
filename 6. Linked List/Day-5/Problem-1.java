/**
 * @author AkashGoyal
 */

/**


--------------------- Problem----------->>  Implement Queue using Linked List

    Problem Link :- https://practice.geeksforgeeks.org/problems/implement-queue-using-linked-list/1

    Reference:- https://www.geeksforgeeks.org/queue-set-1introduction-and-array-implementation/

  */

  class MyQueue
  {
      QueueNode front, rear;
      
      //Function to push an element into the queue.
      void push(int a)
      {
          QueueNode node=new QueueNode(a);
          
          if(rear!=null)
          {
              rear.next=node;
              rear=rear.next;
          }
          else
          {
              front=rear=node;
          }
          
        
          
      }
      
      //Function to pop front element from the queue.
      int pop()
      {
          if(front==null)
          {
              return -1;
          }
          
          int data=front.data;
          front=front.next;
          
          if(front==null)
          {
              rear=null;
          }
          
          return data;
      }
  }
  
  
  
  
  