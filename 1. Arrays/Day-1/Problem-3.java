/**
 * @author AkashGoyal
 * @date 24/05/2021
 */

/**


--------------------- Problem----------->> Kth smallest element 

    Problem Link :- https://practice.geeksforgeeks.org/problems/kth-smallest-element5635/1


    Concept:-

        Min-Heap − Where the value of the root node is less than or equal to either of its children. ---> Priority Queue
            
            PriorityQueue<Integer> pq=new PriorityQueue();
    
        Max-Heap − Where the value of the root node is greater than or equal to either of its children  ---> Reverse of priority Queue 

            PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(Collections.reverseOrder());


            
  //1. We can use priority queue

  //2. We can also directly sort the array and can print kth element.

  //3. We can use min-heap and reduce time complexity.

  */


  //Method-1 --> O(n*logk)--> priority queue(k size Max Heap)


class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        
        PriorityQueue<Integer> maxheap=new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0;i<k;i++)
        {
            maxheap.add(arr[i]);
            
        }
        
        for(int i=k;i<=r;i++)
        {
            if(arr[i]>maxheap.peek())
            {
                continue;
            }
            else
            {
                maxheap.poll();
                maxheap.add(arr[i]);
            }
        }
        
         return maxheap.peek();
    } 
}


//----------------------------------------------------------------------------------------------------------


//Method-2 ---> O(n*logk)--->> Using Min Heap we can stop it after k times because we just need kth smallest number( //https://www.geeksforgeeks.org/min-heap-in-java/)



class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        
        //https://www.geeksforgeeks.org/min-heap-in-java/
        
        //Min-Heap sort
        
        for(int i=((r+1)/2 -1);i>=0;i--)
        {
            heapify(arr,i, r);
            
        }
        
        int count=1;
        for (int i = r; i > 0; i--) {
            if(count==k)
            {
                return arr[0];
            }
            count++;
            
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
 
            heapify(arr, 0, i);
        }
        
        return arr[0];
        
    } 
    
    
    static void heapify(int arr[],int i, int n){
        int smallest=i;
        int left=2*i+1;
        int right=2*i+2;
        
        if(left<n && arr[left]<arr[smallest])
        {
            smallest=left;
        }
        
        if(right<n && arr[right]<arr[smallest])
        {
            smallest=right;
        }
        
        
        if(smallest!=i)
        {
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
            
            heapify(arr,smallest,n);
        }
    }
}


