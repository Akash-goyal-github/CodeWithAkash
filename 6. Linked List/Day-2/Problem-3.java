/**
 * @author AkashGoyal
 */

/**


--------------------- Problem----------->>   Add two numbers represented by linked lists 

    Problem Link :- https://practice.geeksforgeeks.org/problems/add-two-numbers-represented-by-linked-lists/1

  */



class Solution{
  //Function to add two numbers represented by linked list.
  static Node addTwoLists(Node first, Node second){
      // code here
      // return head of sum list
      
      Node a=reverse(first);
      Node b=reverse(second);
      Node sum=new Node(1);
      Node prev=null;
      
      
      int twosum=0;
      
      while(a!=null && b!=null)
      {
          twosum=twosum+a.data+b.data;
          
          if(a.data==0 && b.data==0 && twosum==0)
          {
              Node next=new Node(0);
              sum.next=next;
              sum=sum.next;
              if(prev==null)
              {
                  prev=sum;
              }
          }
          else if(twosum>0)
          {
              Node next=new Node(twosum%10);
              
              sum.next=next;
              twosum=twosum/10;
              sum=sum.next;
              if(prev==null)
              {
                  prev=sum;
              }
          }
          a=a.next;
          b=b.next;
      }
      
      while(a!=null)
      {
          twosum=twosum+a.data;
          if(a.data==0 && twosum==0)
          {
              Node next=new Node(0);
              sum.next=next;
              sum=sum.next;
              if(prev==null)
              {
                  prev=sum;
              }
          }
          else if(twosum>0)
          {
              Node next=new Node(twosum%10);
              
              sum.next=next;
              twosum=twosum/10;
              sum=sum.next;
              if(prev==null)
              {
                  prev=sum;
              }
          }
          a=a.next;
      }
      
      while(b!=null)
      {
          twosum=twosum+b.data;
          
          if(b.data==0 && twosum==0)
          {
              Node next=new Node(0);
              twosum=twosum/10;
              sum.next=next;
              sum=sum.next;
              if(prev==null)
              {
                  prev=sum;
              }
          }
          else if(twosum>0)
          {
              Node next=new Node(twosum%10);
              
              sum.next=next;
              twosum=twosum/10;
              sum=sum.next;
              if(prev==null)
              {
                  prev=sum;
              }
          }
          b=b.next;
      }
      
      while(twosum>0)
      {
              Node next=new Node(twosum%10);
              sum.next=next;
              twosum=twosum/10;
              sum=sum.next;
              if(prev==null)
              {
                  prev=sum;
              }
      }
      return reverse(prev);
  }
  
  
  static Node reverse(Node num)
  {
      
      Node prev=null;
      Node temp=num;
      
      Node current=num;
      
      while(current!=null)
      {
          temp=current;
          current=current.next;
          temp.next=prev;
          prev=temp;
      }
      return prev;
  }
}