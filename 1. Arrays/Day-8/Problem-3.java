/**
 * @author AkashGoyal
 * @date 31/05/2021
 */

/**


--------------------- Problem----------->> Given an array of size n and a number k, find all elements that appear more than " n/k " times.

    Problem Link :- https://practice.geeksforgeeks.org/problems/count-element-occurences/1#



  */

  //Method-1

            public int countOccurence(int[] arr, int n, int k) 
            {
                // your code here,return the answer
                HashMap<Integer, Integer> hmap=new HashMap<>();
                int global_count=0;
                for(int i=0;i<n;i++)
                {
                    if(!hmap.containsKey(arr[i]))
                    {
                        hmap.put(arr[i],1);
                    }
                    else
                    {
                        int count=hmap.get(arr[i]);
                        hmap.put(arr[i],count+1);
                    }
                }
                
                for(Map.Entry<Integer,Integer> entry: hmap.entrySet())
                {
                    if(entry.getValue()>n/k)
                    {
                        global_count++;
                    }
                }
                
                return global_count;
            }


//------------------------------------------------------------------------------------------------------------------------------------------------------------

  //Method-2

            
            /**

            Steps:- (Moore's Algo):- (Can we solve it..????)

            1. (n/2) occurences:-

            https://www.youtube.com/watch?v=AoX3BPWNnoE&list=PLgUwDviBIf0rPG3Ictpu74YWBQ1CaBkm2&t=0s

            2. (n/3) occurences:-

            https://www.youtube.com/watch?v=yDbkQd9t2ig

            3. (n/k) occurences:-

            https://www.geeksforgeeks.org/given-an-array-of-of-size-n-finds-all-the-elements-that-appear-more-than-nk-times/


            */