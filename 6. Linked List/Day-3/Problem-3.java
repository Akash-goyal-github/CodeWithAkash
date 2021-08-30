/**
 * @author Akash Goyal
 */

/**


--------------------- Problem----------->>  Flatten a Linked List 

    Problem Link :- https://practice.geeksforgeeks.org/problems/flattening-a-linked-list/1
 
    */
    class GfG
    {
        Node flatten(Node root)
        {
        // Your code here
        
        Node result=root;
        Node node=root;
        
        while(node.next!=null)
        {
            result=merge(result,node.next);
            node=node.next;
        }
        
        return result;
        }
        
        
        Node merge(Node result, Node root)
        {
            Node node1=result;
            Node node2=root;
            
            Node fin=null;
            Node res=fin;
            
            while(node1!=null && node2!=null)
            {
                if(node1.data<=node2.data)
                {
                    if(res==null)
                    {
                        fin=node1;
                        res=node1;
                        node1=node1.bottom;
                    }
                    else
                    {
                        fin.bottom=node1;
                        node1=node1.bottom;
                        fin=fin.bottom;
                    }
                    
                }
                else
                {
                    if(res==null)
                    {
                        fin=node2;
                        res=node2;
                        node2=node2.bottom;
                    }
                    else
                    {
                        fin.bottom=node2;
                        node2=node2.bottom;
                        fin=fin.bottom;
                    }
                }
            }
            
            if(node1!=null)
            {
                fin.bottom=node1;
            }
            
            if(node2!=null)
            {
                fin.bottom=node2;
            }
            
            return res;
        }
    }