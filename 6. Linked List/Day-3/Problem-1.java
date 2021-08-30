/**
 * @author AkashGoyal
 */

/**


--------------------- Problem----------->>   Intersection Point in Y Shapped Linked Lists

    Problem Link :- https://practice.geeksforgeeks.org/problems/intersection-point-in-y-shapped-linked-lists/1
    
  */



  class Intersect
  {
      //Function to find intersection point in Y shaped Linked Lists.
      int intersectPoint(Node head1, Node head2)
      {
           // code here
           int count1=0;
           int count2=0;
           Node node1=head1;
           Node node2=head2;
           while(head1.next!=null)
           {
               head1=head1.next;
               count1++;
           }
           while(head2.next!=null)
           {
               head2=head2.next;
               count2++;
           }
           
           head1=node1;
           head2=node2;
           
           int diff=Math.abs(count1-count2);
           
           if(count1>count2)
           {
               
               while(diff>0)
               {
                   head1=head1.next;
                   diff--;
               }
           }
           else
           {
               while(diff>0)
               {
                   head2=head2.next;
                   diff--;
               }
           }
           int data=0;
           
           while(head1.next!=null && head2.next!=null && head1!=head2)
           {
               
               head1=head1.next;
               head2=head2.next;
           }
           
           return head1.data;
      }
  }
  
  
  