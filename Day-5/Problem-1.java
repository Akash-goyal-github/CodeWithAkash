/**
 * @author AkashGoyal
 * @date 28/05/2021
 */

/**


--------------------- Problem----------->> Merge Intervals

    Problem Link :- https://leetcode.com/problems/merge-intervals/

  */


  class Solution {
    public int[][] merge(int[][] intervals) {
        
        int count=0;
        
        //Sorting the Array according to the 1st index value
        
        
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0],b[0]));
        
        
        for(int i=1;i<intervals.length;i++)
        {
            if(intervals[i][0]-intervals[count][1]<=0)
            {
                intervals[count][0]=Math.min(intervals[count][0],intervals[i][0]);
                intervals[count][1]=Math.max(intervals[count][1],intervals[i][1]);
               
            }
            
            else
            {
                count++;
                intervals[count][0]=intervals[i][0];
                intervals[count][1]=intervals[i][1];
            }
            
        }
        
        int newinterval[][]=new int[count+1][2];
        for(int i=0;i<=count;i++)
        {
            newinterval[i][0]=intervals[i][0];
            newinterval[i][1]=intervals[i][1];
        }
        
        return newinterval;
    }
}