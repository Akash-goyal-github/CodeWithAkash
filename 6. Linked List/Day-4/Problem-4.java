/**
 * @author AkashGoyal
 */

/**


--------------------- Problem----------->>  Merge two sorted Linked list

    Problem Link :- https://practice.geeksforgeeks.org/problems/merge-two-sorted-linked-lists/1

  */


  class LinkedList
  {
      //Function to merge two sorted linked list.
      Node sortedMerge(Node head1, Node head2) {
       // This is a "method-only" submission. 
       // You only need to complete this method
       
       Node node1=head1;
       Node node2=head2;
       
       Node fin=null;
       Node result=fin;
       
       while(node1!=null && node2!=null)
       {
           if(node1.data<node2.data)
           {
               if(fin==null)
               {
                   fin=node1;
                   result=node1;
               }
               else
               {
                   fin.next=node1;
                   fin=fin.next;
               }
               
               node1=node1.next;
           }
           else
           {
               if(fin==null)
               {
                   fin=node2;
                   result=node2;
               }
               else
               {
                   fin.next=node2;
                   fin=fin.next;
               }
               node2=node2.next;
           }
       }
       
       if(node1!=null)
       {
           fin.next=node1;
       }
       
       if(node2!=null)
       {
           fin.next=node2;
       }
       
       return result;
     } 
  }
  