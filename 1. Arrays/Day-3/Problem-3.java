/**
 * @author AkashGoyal
 * @date 26/05/2021
 */

/**


--------------------- Problem----------->> Minimum number of jumps

    Problem Link :- https://practice.geeksforgeeks.org/problems/minimum-number-of-jumps-1587115620/1

  */
  
//Reference:- https://www.youtube.com/watch?v=CqgK_qi4SKQ   --->> O(N)

class Solution{
    static int minJumps(int[] arr){
        // your code here
     int maxRange=arr[0];
        int Remainingsteps=arr[0];
        int no_of_jump=1;
        
    if(arr.length<=1)
    {
        return 0;
    }
    else if(arr[0]==0)
    {
        return -1;
    }
    else
    {
       
        
        for(int i=1;i<arr.length;i++)
        {
            if(i==arr.length-1)
            {
                return no_of_jump;
            }
            maxRange=Math.max(maxRange,i+arr[i]);
            Remainingsteps--;
            
            if(Remainingsteps==0)
            {
                no_of_jump++;
                if(i>=maxRange)
                {
                    return -1;
                }
                
                Remainingsteps=maxRange-i;
            }
            
        }
    }
    
    return no_of_jump;
   
}
}

//-------------------------------------------------------------------------------------------------------------------------------------------



//Reference:- https://www.youtube.com/watch?v=cETfFsSTGJI  --->> O(N^2)--> Dynamic Programming


class Solution{
    static int minJumps(int[] arr){
        // your code here
    
    if(arr[0]==0)
    {
        return -1;
    }
      int no_of_jumps[]=new int[arr.length];
      //int jumps_path[]=new int[arr.length];
      
      no_of_jumps[0]=0;
      //jumps_path[0]=-1;
      
      for(int i=1;i<arr.length;i++)
      {
          no_of_jumps[i]=Integer.MAX_VALUE;
      }
      
      for(int i=1;i<arr.length;i++)
      {
          for(int j=0;j<i;j++)
          {
             
            if(arr[j] + j >= i){
              if(no_of_jumps[i]>(no_of_jumps[j]+1))
              {
                  no_of_jumps[i]=no_of_jumps[j]+1;
                  //jumps_path[i]=j;
              }
               }
              
          }
      }
      
      /*for(int i=0;i<arr.length;i++)
      {
          System.out.println(jumps_path[i]+"--------"+no_of_jumps[i]);
      }
      */
       if(no_of_jumps[arr.length-1]==Integer.MAX_VALUE)
      {
          return -1;
      }
      return no_of_jumps[arr.length-1];
    }
    
    
   
}

