/**
 * @author AkashGoyal
 * @date 28/05/2021
 */

/**


--------------------- Problem----------->> Count pairs with given sum

    Problem Link :- https://practice.geeksforgeeks.org/problems/count-pairs-with-given-sum5022/1


    Reference:- https://www.youtube.com/watch?v=bvKMZXc0jQU

  */


class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        // code here
        
        int pair_count=0;
        
        HashMap<Integer,Integer> hs=new HashMap<>();
        
        for(int i=0;i<n;i++)
        {
            if(!hs.containsKey(arr[i]))
            {
                hs.put(arr[i],1);
            }
            else
            {
                int count=hs.get(arr[i]);
                count++;
                hs.put(arr[i],count);
            }
        }
        
       for(Integer key: hs.keySet())
       {
           if(hs.containsKey(k-key))
               {
                   pair_count+=hs.get(key)*hs.get(k-key);   //
               }
           
       }
       
       
       if(k%2==0 && hs.containsKey(k/2))
       {
           if(hs.get(k/2)>1)
           {
               
               //removing already considered k/2 term .
               pair_count-=hs.get(k/2)*hs.get(k/2);
          
           }
       }
       
       //dividing pair count because pairs have been considered twice-->> (n,k-n), (k-n,n)
       
       pair_count=pair_count/2 ;
       
       
        if(k%2==0 && hs.containsKey(k/2))
           {
               if(hs.get(k/2)>1)
               {
                   
                      //adding no of pairs of k/2
                      
                     pair_count+= ((hs.get(k/2)*(hs.get(k/2)-1)))/2;
               }
           }
       
       return pair_count;
        
    }
}
